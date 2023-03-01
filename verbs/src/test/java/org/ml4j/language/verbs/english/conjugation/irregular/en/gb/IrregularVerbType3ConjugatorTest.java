package org.ml4j.language.verbs.english.conjugation.irregular.en.gb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugators;
import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugator;
import org.ml4j.language.verbs.english.conjugation.irregular.ToBeVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.irregular.base.IrregularVerbConjugatorTestBase;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.SortedMap;
import java.util.TreeMap;

public class IrregularVerbType3ConjugatorTest extends IrregularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testVerbConjugation(EnglishWordsEnGB.IRREGULAR_VERBS_TYPE_3, EXPECTED_CONJUGATED_VERBS_TYPE_3_FILE_PATH);
    }

    @Override
    protected void testVerbConjugation(SortedMap<WordDefinitionId, WordDefinition> verbs, String expectedResultsFilePath) {

        IrregularVerbConjugator irregularVerbConjugator = VerbConjugators.IRREGULAR_VERB_CONJUGATOR;

        SortedMap<WordDefinitionId, ToBeVerbConjugation> expectedConjugatedVerbs = new TreeMap<>();
        expectedConjugatedVerbs.put(new WordDefinitionId("be", 1), new ToBeVerbConjugation());

        testVerbConjugation(irregularVerbConjugator, expectedConjugatedVerbs, verbs);
    }

    @Override
    protected void assertEqual(VerbConjugation first, VerbConjugation second) {
        Assertions.assertTrue(first instanceof ToBeVerbConjugation);
        Assertions.assertTrue(second instanceof ToBeVerbConjugation);
    }
}
