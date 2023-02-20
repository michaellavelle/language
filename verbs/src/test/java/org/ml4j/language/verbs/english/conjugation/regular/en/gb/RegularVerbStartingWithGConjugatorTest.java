package org.ml4j.language.verbs.english.conjugation.regular.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.regular.base.RegularVerbConjugatorTestBase;

public class RegularVerbStartingWithGConjugatorTest extends RegularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testRegularVerbConjugation(EnglishWordsEnGB.REGULAR_VERBS_STARTING_WITH_G, EXPECTED_CONJUGATED_VERBS_STARTING_WITH_G_FILE_PATH);
    }

}
