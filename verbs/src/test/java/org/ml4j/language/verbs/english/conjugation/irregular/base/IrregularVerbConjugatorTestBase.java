package org.ml4j.language.verbs.english.conjugation.irregular.base;

import org.junit.jupiter.api.Assertions;
import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugator;
import org.ml4j.language.verbs.english.conjugation.util.VerbConjugationCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class IrregularVerbConjugatorTestBase {

    protected final static String DEFINED_CONJUGATED_VERBS_TYPE_1_FILE_PATH = "/english/irregular/en_UK/irregular_verbs_type_1_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_TYPE_1_FILE_PATH = "/english/irregular/en_UK/irregular_verbs_type_1_expected_conjugations.csv";

    private List<String> getValuesFromVariables(List<String> csvVariables, String key, boolean required) {
        String prefix = key + "=";
        List<String> candidates = csvVariables.stream().filter(v -> v.startsWith(prefix)).collect(Collectors.toList());
        if (required && candidates.isEmpty()) {
            throw new IllegalStateException("No value defined for key:" + key + " within:" + csvVariables);
        } else {
            return candidates.stream().map(v -> v.substring(prefix.length())).collect(Collectors.toList());
        }
    }

    protected void testRegularVerbConjugation(SortedMap<WordDefinitionId, WordDefinition> verbs, String expectedResultsFilePath) {

        IrregularVerbConjugator irregularVerbConjugator = new IrregularVerbConjugator(Arrays.asList(DEFINED_CONJUGATED_VERBS_TYPE_1_FILE_PATH));

        SortedMap<WordDefinitionId, IrregularVerbConjugation> expectedConjugatedVerbsStartingWithA = new VerbConjugationCSVReader<>((i, v) ->
                new IrregularVerbConjugation(v.get(0), i.getMeaningId(), getValuesFromVariables(v, "past_tense", false), getValuesFromVariables(v, "past_participle", false), getValuesFromVariables(v, "present_participle", true)),
                false, Arrays.asList(expectedResultsFilePath)).load();

        SortedMap<WordDefinitionId, IrregularVerbConjugation> conjugatedVerbsStartingWithA = irregularVerbConjugator.getConjugatedVerbs(verbs);

        Assertions.assertEquals(expectedConjugatedVerbsStartingWithA.size(), conjugatedVerbsStartingWithA.size());

        for (Map.Entry<WordDefinitionId, IrregularVerbConjugation> entry : expectedConjugatedVerbsStartingWithA.entrySet()) {
            System.out.println(entry.getKey());
            Assertions.assertEquals(entry.getValue(), conjugatedVerbsStartingWithA.get(entry.getKey()));
        }

        Assertions.assertEquals(expectedConjugatedVerbsStartingWithA, conjugatedVerbsStartingWithA);

    }
}
