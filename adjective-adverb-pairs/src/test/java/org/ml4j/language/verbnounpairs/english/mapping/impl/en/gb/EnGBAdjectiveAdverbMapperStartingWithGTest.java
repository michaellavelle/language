package org.ml4j.language.verbnounpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.verbnounpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;

public class EnGBAdjectiveAdverbMapperStartingWithGTest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testAdjectiveAdverbMapping() {
        testAdjectiveAdverbMapping(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_G, EnglishAdjectiveAdverbPairsEnGB.ADVERBS_STARTING_WITH_G, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_G_FILE_PATH);
    }


}
