package org.ml4j.language.verbs.english.conjugation.regular.base;

import org.junit.jupiter.api.Assertions;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugator;
import org.ml4j.language.verbs.english.conjugation.util.VerbConjugationCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class RegularVerbConjugatorTestBase {

    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_A_FILE_PATH = "/english/regular/en_UK/regular_verbs_a_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_B_FILE_PATH = "/english/regular/en_UK/regular_verbs_b_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_C_FILE_PATH = "/english/regular/en_UK/regular_verbs_c_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_D_FILE_PATH = "/english/regular/en_UK/regular_verbs_d_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_E_FILE_PATH = "/english/regular/en_UK/regular_verbs_e_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_F_FILE_PATH = "/english/regular/en_UK/regular_verbs_f_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_G_FILE_PATH = "/english/regular/en_UK/regular_verbs_g_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_H_FILE_PATH = "/english/regular/en_UK/regular_verbs_h_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_I_FILE_PATH = "/english/regular/en_UK/regular_verbs_i_conjugations.csv";


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

        RegularVerbConjugator regularVerbConjugator = new RegularVerbConjugator();

        SortedMap<WordDefinitionId, RegularVerbConjugation> expectedConjugatedVerbsStartingWithA =
                new VerbConjugationCSVReader<>((i, v) ->
                        new RegularVerbConjugation(v.get(0), i.getMeaningId(), getValuesFromVariables(v, "past_tense", false), getValuesFromVariables(v, "present_participle", true)),
                        false, Arrays.asList(expectedResultsFilePath)).load();

        SortedMap<WordDefinitionId, RegularVerbConjugation> conjugatedVerbsStartingWithA = regularVerbConjugator.getConjugatedVerbs(verbs);

        Assertions.assertEquals(expectedConjugatedVerbsStartingWithA.size(), conjugatedVerbsStartingWithA.size());

        for (Map.Entry<WordDefinitionId, RegularVerbConjugation> entry : expectedConjugatedVerbsStartingWithA.entrySet()) {
            Assertions.assertEquals(entry.getValue(), conjugatedVerbsStartingWithA.get(entry.getKey()));
        }

        for (Map.Entry<WordDefinitionId, RegularVerbConjugation> entry : conjugatedVerbsStartingWithA.entrySet()) {
            Assertions.assertEquals(entry.getValue(), expectedConjugatedVerbsStartingWithA.get(entry.getKey()));
        }

        Assertions.assertEquals(expectedConjugatedVerbsStartingWithA, conjugatedVerbsStartingWithA);

    }
}
