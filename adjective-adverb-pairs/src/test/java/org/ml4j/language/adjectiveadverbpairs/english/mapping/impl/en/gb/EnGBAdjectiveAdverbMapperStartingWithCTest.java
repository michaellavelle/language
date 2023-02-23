package org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;

public class EnGBAdjectiveAdverbMapperStartingWithCTest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testAdjectiveAdverbMapping() {
        testAdjectiveAdverbMapping(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_C, EnglishAdjectiveAdverbPairsEnGB.ADVERBS_STARTING_WITH_C, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_C_FILE_PATH);
    }


}
