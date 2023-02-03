package org.ml4j.language.verbs.english.conjugation.irregular.en.uk;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.irregular.base.IrregularVerbConjugatorTestBase;

public class IrregularVerbType1ConjugatorTest extends IrregularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testIrregularVerbConjugation(EnglishWordsEnUK.IRREGULAR_VERBS_TYPE_1, EXPECTED_CONJUGATED_VERBS_TYPE_1_FILE_PATH);
    }

}
