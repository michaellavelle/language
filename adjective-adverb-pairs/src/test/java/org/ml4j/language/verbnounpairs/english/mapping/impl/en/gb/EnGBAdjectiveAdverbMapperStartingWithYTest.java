package org.ml4j.language.verbnounpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4j.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.verbnounpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;

public class EnGBAdjectiveAdverbMapperStartingWithYTest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testAdjectiveAdverbMapping() {
        testAdjectiveAdverbMapping(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_Y, EnglishAdjectiveAdverbPairsEnGB.ADVERBS_STARTING_WITH_Y, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_Y_FILE_PATH);
    }


}
