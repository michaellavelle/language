package org.ml4j.language.verbs.english.conjugation.regular.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.regular.base.RegularVerbConjugatorTestBase;

public class RegularVerbStartingWithIConjugatorTest extends RegularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testVerbConjugation(EnglishWordsEnGB.REGULAR_VERBS_STARTING_WITH_I, EXPECTED_CONJUGATED_VERBS_STARTING_WITH_I_FILE_PATH);
    }

}
