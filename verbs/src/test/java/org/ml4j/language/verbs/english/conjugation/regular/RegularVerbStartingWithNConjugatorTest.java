package org.ml4j.language.verbs.english.conjugation.regular;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.regular.base.RegularVerbConjugatorTestBase;

public class RegularVerbStartingWithNConjugatorTest extends RegularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testRegularVerbConjugation(EnglishWordsEnUK.VERBS_STARTING_WITH_M, EXPECTED_CONJUGATED_VERBS_STARTING_WITH_M_FILE_PATH);
    }

}
