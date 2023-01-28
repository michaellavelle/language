package org.ml4j.language.verbs.english.conjugation.regular.base;

import org.junit.jupiter.api.Assertions;
import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugator;
import org.ml4j.language.words.WordDefinition;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RegularVerbConjugatorTestBase {

    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_A_FILE_PATH = "/english/regular/en_UK/regular_verbs_a_conjugations.csv";

    private String getValueFromVariables(List<String> csvVariables, String key) {
        String prefix = key + "=";
        List<String> candidates = csvVariables.stream().filter(v -> v.startsWith(prefix)).collect(Collectors.toList());
        if (candidates.size() > 1) {
            throw new IllegalStateException("Only expecting to have one past tense defined at this time for:" + csvVariables.get(0));
        } else if (candidates.size() == 0) {
            throw new IllegalStateException("Not past tense defined for:" + csvVariables.get(0));
        } else {
            return candidates.get(0).substring(prefix.length());
        }
    }

    protected void testRegularVerbConjugation(List<WordDefinition> verbs, String expectedResultsFilePath) {

        RegularVerbConjugator regularVerbConjugator = new RegularVerbConjugator();

        List<RegularVerbConjugation> expectedConjeugatedVerbsStartingWithA = new CSVReader<>(v ->
                new RegularVerbConjugation(v.get(0), getValueFromVariables(v, "past_tense"), getValueFromVariables(v, "present_participle")), false, expectedResultsFilePath).load();
        Collections.sort(expectedConjeugatedVerbsStartingWithA, Comparator.comparing(RegularVerbConjugation::getVerb));

        List<RegularVerbConjugation> conjugatedVerbsStartingWithA = regularVerbConjugator.getConjugatedVerbs(verbs);
        Collections.sort(conjugatedVerbsStartingWithA, Comparator.comparing(RegularVerbConjugation::getVerb));

        Assertions.assertEquals(expectedConjeugatedVerbsStartingWithA.size(), conjugatedVerbsStartingWithA.size());

        Assertions.assertEquals(expectedConjeugatedVerbsStartingWithA, conjugatedVerbsStartingWithA);

    }
}
