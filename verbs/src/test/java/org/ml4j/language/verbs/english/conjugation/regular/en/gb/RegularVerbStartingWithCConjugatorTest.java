package org.ml4j.language.verbs.english.conjugation.regular.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.regular.base.RegularVerbConjugatorTestBase;

public class RegularVerbStartingWithCConjugatorTest extends RegularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testVerbConjugation(EnglishWordsEnGB.REGULAR_VERBS_STARTING_WITH_C, EXPECTED_CONJUGATED_VERBS_STARTING_WITH_C_FILE_PATH);
    }

}
