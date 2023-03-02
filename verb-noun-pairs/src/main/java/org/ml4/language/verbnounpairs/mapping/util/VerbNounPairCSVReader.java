package org.ml4.language.verbnounpairs.mapping.util;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiFunction;


public class VerbNounPairCSVReader extends CSVReader<WordDefinitionId, VerbNounPair> {



    public VerbNounPairCSVReader(boolean firstLineAsHeader, String primaryFileResource, String... additionalFileResources) {
        super((i, v) ->
                new VerbNounPair(v.get(0), i.getMeaningId(), v.get(1)),
                c -> new WordDefinitionId(c.getVerb(), c.getVerbOccurrenceId()),
                (r, v) -> new WordDefinitionId(v.get(1), getNounMeaningId(r, v.get(1))),
                firstLineAsHeader, primaryFileResource, additionalFileResources);
    }

    public VerbNounPairCSVReader(boolean firstLineAsHeader, List<String> fileResources) {
        super((i, v) ->
                        new VerbNounPair(v.get(0), i.getMeaningId(), v.get(1)),
                c -> new WordDefinitionId(c.getVerb(), c.getVerbOccurrenceId()),
                (r, v) -> new WordDefinitionId(v.get(1), 1),
                firstLineAsHeader, fileResources);
    }

    private static int getNounMeaningId(SortedMap<WordDefinitionId, VerbNounPair> resultsSoFar, String noun) {
        int meaningId = 1;
        Integer maxMeaningId = null;
        for (Map.Entry<WordDefinitionId, VerbNounPair> entry : resultsSoFar.entrySet()) {
            if (entry.getValue().getNoun().equals(noun)) {
                meaningId++;
                if (maxMeaningId == null || entry.getKey().getMeaningId() > maxMeaningId.intValue()) {
                    maxMeaningId = entry.getKey().getMeaningId() + 1;
                }
            }
        }
        // Sanity check
        if (maxMeaningId != null) {
            if (meaningId != (maxMeaningId)) {
                throw new IllegalStateException("Meaning id does match expected value of " + (maxMeaningId) + " for:" + noun);
            }
        } else {
            if (meaningId != 1) {
                throw new IllegalStateException("Meaning id does match expected value of 1 for :" + noun);
            }
        }

        return meaningId;
    }
}
