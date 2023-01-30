package org.ml4j.language.verbs.english.conjugation.util;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugation;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VerbConjugationCSVReader<T extends VerbConjugation> extends CSVReader<WordDefinitionId, T> {

    public VerbConjugationCSVReader(BiFunction<WordDefinitionId, List<String>, T> mappingFunction, Function<IrregularVerbConjugation, WordDefinitionId> idExtractor, BiFunction<SortedMap<WordDefinitionId, IrregularVerbConjugation>, List<String>, WordDefinitionId> idGenerator, boolean firstLineAsHeader, String primaryFileResource, String... additionalFileResources) {
        super(mappingFunction,
                c -> new WordDefinitionId(c.getVerb(), c.getMeaningId()),
                (r, v) -> new WordDefinitionId(v.get(0), getMeaningId(r, v.get(0))),
                firstLineAsHeader, primaryFileResource, additionalFileResources);
    }

    public VerbConjugationCSVReader(BiFunction<WordDefinitionId, List<String>, T> mappingFunction, boolean firstLineAsHeader, List<String> fileResources) {
        super(mappingFunction,
                c -> new WordDefinitionId(c.getVerb(), c.getMeaningId()),
                (r, v) -> new WordDefinitionId(v.get(0), getMeaningId(r, v.get(0))),
                firstLineAsHeader, fileResources);
    }

    private static List<String> getValuesFromVariables(List<String> csvVariables, String key, boolean required) {
        String prefix = key + "=";
        List<String> candidates = csvVariables.stream().filter(v -> v.startsWith(prefix)).collect(Collectors.toList());
        if (required && candidates.isEmpty()) {
            throw new IllegalStateException("No value defined for key:" + key + " within:" + csvVariables);
        } else {
            return candidates.stream().map(v -> v.substring(prefix.length())).collect(Collectors.toList());
        }
    }

    private static <V extends VerbConjugation> int getMeaningId(SortedMap<WordDefinitionId, V> resultsSoFar, String verb) {
        int meaningId = 1;
        Integer maxMeaningId = null;
        for (Map.Entry<WordDefinitionId, V> entry : resultsSoFar.entrySet()) {
            if (entry.getValue().getVerb().equals(verb)) {
                meaningId++;
                if (maxMeaningId == null || entry.getKey().getMeaningId() > maxMeaningId.intValue()) {
                    maxMeaningId = entry.getKey().getMeaningId() + 1;
                }
            }
        }
        // Sanity check
        if (maxMeaningId != null) {
            if (meaningId != (maxMeaningId)) {
                throw new IllegalStateException("Meaning id does match expected value of " + (maxMeaningId));
            }
        } else {
            if (meaningId != 1) {
                throw new IllegalStateException("Meaning id does match expected value of 1");
            }
        }

        return meaningId;
    }
}
