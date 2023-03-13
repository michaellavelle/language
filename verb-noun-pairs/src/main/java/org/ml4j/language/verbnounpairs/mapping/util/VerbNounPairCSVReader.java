package org.ml4j.language.verbnounpairs.mapping.util;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;


public class VerbNounPairCSVReader extends CSVReader<WordDefinitionId, VerbNounPair> {



    public VerbNounPairCSVReader(boolean firstLineAsHeader, String primaryFileResource, String... additionalFileResources) {
        super((i, v) ->
                new VerbNounPair(v.get(0), i.getMeaningId(), v.get(1)),
                c -> WordDefinitionId.create(c.getVerb(), c.getVerbOccurrenceId()),
                (r, v) -> WordDefinitionId.create(v.get(0), getVerbOccurrenceId(r, v.get(0))),
                firstLineAsHeader, primaryFileResource, additionalFileResources);
    }

    public VerbNounPairCSVReader(boolean firstLineAsHeader, List<String> fileResources) {
        super((i, v) ->
                        new VerbNounPair(v.get(0), i.getMeaningId(), v.get(1)),
                c -> WordDefinitionId.create(c.getVerb(), c.getVerbOccurrenceId()),
                (r, v) -> WordDefinitionId.create(v.get(0), getVerbOccurrenceId(r, v.get(0))),
                firstLineAsHeader, fileResources);
    }

    private static int getVerbOccurrenceId(SortedMap<WordDefinitionId, VerbNounPair> resultsSoFar, String verb) {
        int meaningId = 1;
        for (Map.Entry<WordDefinitionId, VerbNounPair> entry : resultsSoFar.entrySet()) {
            if (entry.getValue().getVerb().equals(verb)) {
                meaningId++;
            }
        }
        return meaningId;
    }
}
