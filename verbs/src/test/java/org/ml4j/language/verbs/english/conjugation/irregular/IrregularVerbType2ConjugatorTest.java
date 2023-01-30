package org.ml4j.language.verbs.english.conjugation.irregular;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.irregular.base.IrregularVerbConjugatorTestBase;

public class IrregularVerbType2ConjugatorTest extends IrregularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testIrregularVerbConjugation(EnglishWordsEnUK.IRREGULAR_VERBS_TYPE_2, EXPECTED_CONJUGATED_VERBS_TYPE_2_FILE_PATH);
    }

}
