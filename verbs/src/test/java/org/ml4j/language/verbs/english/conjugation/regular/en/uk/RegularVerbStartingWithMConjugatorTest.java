package org.ml4j.language.verbs.english.conjugation.regular.en.uk;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.regular.base.RegularVerbConjugatorTestBase;

public class RegularVerbStartingWithMConjugatorTest extends RegularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testRegularVerbConjugation(EnglishWordsEnUK.REGULAR_VERBS_STARTING_WITH_M, EXPECTED_CONJUGATED_VERBS_STARTING_WITH_M_FILE_PATH);
    }

}
