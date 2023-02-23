package org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.base.AdjectiveAdverbMapperTestBase;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class EnGBAdjectiveAdverbMapperStartingWithATest extends AdjectiveAdverbMapperTestBase {

    @Test
    public void testAdjectiveAdverbMapping() {
        testAdjectiveAdverbMapping(EnglishAdjectiveAdverbPairsEnGB.ADJECTIVES_STARTING_WITH_A, EnglishAdjectiveAdverbPairsEnGB.ADVERBS_STARTING_WITH_A, EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_A_FILE_PATH);
    }


}
