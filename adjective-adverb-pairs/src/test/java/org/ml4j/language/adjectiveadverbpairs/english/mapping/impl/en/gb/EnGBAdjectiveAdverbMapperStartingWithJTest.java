package org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;

public class EnGBAdjectiveAdverbMapperStartingWithJTest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testAdjectiveAdverbMapping() {
        testAdjectiveAdverbMapping(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_J, EnglishAdjectiveAdverbPairsEnGB.ADVERBS_STARTING_WITH_J, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_J_FILE_PATH);
    }


}
