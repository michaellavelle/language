package org.ml4j.language.verbnounpairs.mapping.util;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiFunction;


public class AdjectiveAdverbMappingCSVReader extends CSVReader<WordDefinitionId, AdjectiveAdverbMapping> {

    public AdjectiveAdverbMappingCSVReader(BiFunction<WordDefinitionId, List<String>, AdjectiveAdverbMapping> mappingFunction, boolean firstLineAsHeader, String primaryFileResource, String... additionalFileResources) {
        super(mappingFunction,
                c -> WordDefinitionId.create(c.getAdjective(), c.getAdjectiveMeaningId()),
                (r, v) -> WordDefinitionId.create(v.get(1), getAdverbMeaningId(r, v.get(1))),
                firstLineAsHeader, primaryFileResource, additionalFileResources);
    }

    public AdjectiveAdverbMappingCSVReader(BiFunction<WordDefinitionId, List<String>, AdjectiveAdverbMapping> mappingFunction, boolean firstLineAsHeader, List<String> fileResources) {
        super(mappingFunction,
                c -> WordDefinitionId.create(c.getAdjective(), c.getAdjectiveMeaningId()),
                (r, v) -> WordDefinitionId.create(v.get(1), 1),
                firstLineAsHeader, fileResources);
    }

    private static int getAdverbMeaningId(SortedMap<WordDefinitionId, AdjectiveAdverbMapping> resultsSoFar, String adverb) {
        int meaningId = 1;
        for (Map.Entry<WordDefinitionId, AdjectiveAdverbMapping> entry : resultsSoFar.entrySet()) {
            for (String adv : entry.getValue().getAdverbs()) {
                if (adv.equals(adverb)) {
                    meaningId++;
                }
            }
        }
        return meaningId;
    }
}
