package org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;

public class EnGBAdjectiveAdverbMapperStartingWithATest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testRegularVerbConjugation(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_A, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_A_FILE_PATH);
    }

}
