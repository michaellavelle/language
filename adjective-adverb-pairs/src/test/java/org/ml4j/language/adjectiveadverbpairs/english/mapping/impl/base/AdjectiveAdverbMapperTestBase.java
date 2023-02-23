package org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.base;

import org.junit.jupiter.api.Assertions;
import org.ml4.language.adjectiveadverbpairs.english.mapping.AdjectiveAdverbMapper;
import org.ml4.language.adjectiveadverbpairs.english.mapping.impl.EnGBAdjectiveAdverbMapper;
import org.ml4j.language.adjectiveadverbpairs.mapping.util.AdjectiveAdverbPair;
import org.ml4j.language.adjectiveadverbpairs.mapping.util.AdjectiveAdverbPairCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;

public class AdjectiveAdverbMapperTestBase {

    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_A_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_a_mappings.csv";

    protected void testRegularVerbConjugation(SortedMap<WordDefinitionId, WordDefinition> verbs, String expectedResultsFilePath) {

        AdjectiveAdverbMapper adverbMapper = new EnGBAdjectiveAdverbMapper();

        SortedMap<WordDefinitionId, AdjectiveAdverbPair> expectedMappings =
                new AdjectiveAdverbPairCSVReader((i, v) ->
                        new AdjectiveAdverbPair(v.get(0), i.getMeaningId(), v.get(1)),
                        false, Arrays.asList(expectedResultsFilePath)).load();

        for (Map.Entry<WordDefinitionId, AdjectiveAdverbPair> entry : expectedMappings.entrySet()) {
            Assertions.assertEquals(entry.getKey().getWord(), entry.getValue().getAdjective());
            String mappedAdverb = adverbMapper.getAdverbFromAdjective(entry.getKey().getWord());
            Assertions.assertEquals(entry.getValue().getAdverb(), mappedAdverb);
        }
    }
}
