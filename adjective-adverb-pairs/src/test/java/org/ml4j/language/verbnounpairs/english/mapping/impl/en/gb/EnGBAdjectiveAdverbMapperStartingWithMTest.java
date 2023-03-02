package org.ml4j.language.verbnounpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.verbnounpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;

public class EnGBAdjectiveAdverbMapperStartingWithMTest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testAdjectiveAdverbMapping() {
        testAdjectiveAdverbMapping(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_M, EnglishAdjectiveAdverbPairsEnGB.ADVERBS_STARTING_WITH_M, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_M_FILE_PATH);
    }


}
