package org.ml4j.language.verbnounpairs.mapping.util;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiFunction;


public class AdjectiveAdverbPairCSVReader extends CSVReader<WordDefinitionId, AdjectiveAdverbPair> {

    public AdjectiveAdverbPairCSVReader(BiFunction<WordDefinitionId, List<String>, AdjectiveAdverbPair> mappingFunction, boolean firstLineAsHeader, String primaryFileResource, String... additionalFileResources) {
        super(mappingFunction,
                c -> new WordDefinitionId(c.getAdjective(), c.getAdjectiveMeaningId()),
                (r, v) -> new WordDefinitionId(v.get(1), getAdverbMeaningId(r, v.get(1))),
                firstLineAsHeader, primaryFileResource, additionalFileResources);
    }

    public AdjectiveAdverbPairCSVReader(BiFunction<WordDefinitionId, List<String>, AdjectiveAdverbPair> mappingFunction, boolean firstLineAsHeader, List<String> fileResources) {
        super(mappingFunction,
                c -> new WordDefinitionId(c.getAdjective(), c.getAdjectiveMeaningId()),
                (r, v) -> new WordDefinitionId(v.get(1), 1),
                firstLineAsHeader, fileResources);
    }

    private static int getAdverbMeaningId(SortedMap<WordDefinitionId, AdjectiveAdverbPair> resultsSoFar, String adverb) {
        int meaningId = 1;
        Integer maxMeaningId = null;
        for (Map.Entry<WordDefinitionId, AdjectiveAdverbPair> entry : resultsSoFar.entrySet()) {
            if (entry.getValue().getAdverb().equals(adverb)) {
                meaningId++;
                if (maxMeaningId == null || entry.getKey().getMeaningId() > maxMeaningId.intValue()) {
                    maxMeaningId = entry.getKey().getMeaningId() + 1;
                }
            }
        }
        // Sanity check
        if (maxMeaningId != null) {
            if (meaningId != (maxMeaningId)) {
                throw new IllegalStateException("Meaning id does match expected value of " + (maxMeaningId) + " for:" + adverb);
            }
        } else {
            if (meaningId != 1) {
                throw new IllegalStateException("Meaning id does match expected value of 1 for :" + adverb);
            }
        }

        return meaningId;
    }
}
