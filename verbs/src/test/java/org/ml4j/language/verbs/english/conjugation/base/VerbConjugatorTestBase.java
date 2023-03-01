package org.ml4j.language.verbs.english.conjugation.base;

import org.junit.jupiter.api.Assertions;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugator;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class VerbConjugatorTestBase {


    protected List<String> getValuesFromVariables(List<String> csvVariables, String key, boolean required) {
        String prefix = key + "=";
        List<String> candidates = csvVariables.stream().filter(v -> v.startsWith(prefix)).collect(Collectors.toList());
        if (required && candidates.isEmpty()) {
            throw new IllegalStateException("No value defined for key:" + key + " within:" + csvVariables);
        } else {
            return candidates.stream().map(v -> v.substring(prefix.length())).collect(Collectors.toList());
        }
    }

    protected <C extends VerbConjugation> SortedMap<WordDefinitionId, C> getConjugatedVerbs(VerbConjugator<C> verbConjugator, SortedMap<WordDefinitionId, WordDefinition> verbDefinitions) {
        SortedMap<WordDefinitionId, C> results = new TreeMap<>();
        for (Map.Entry<WordDefinitionId, WordDefinition> entry : verbDefinitions.entrySet()) {
            results.put(entry.getKey(), verbConjugator.getConjugatedVerb(entry.getValue()));
        }
        return results;
    }

    protected void assertEqual(VerbConjugation first, VerbConjugation second) {
        Assertions.assertEquals(first, second);
    }

    protected <C extends VerbConjugation> void testVerbConjugation(VerbConjugator<C> verbConjugator, SortedMap<WordDefinitionId, ? extends C> expectedConjugatedVerbs, SortedMap<WordDefinitionId, WordDefinition> verbs) {

        SortedMap<WordDefinitionId, C> conjugatedVerbsStartingWithA = getConjugatedVerbs(verbConjugator, verbs);

        for (Map.Entry<WordDefinitionId, ? extends C> entry : expectedConjugatedVerbs.entrySet()) {
            assertEqual(entry.getValue(), conjugatedVerbsStartingWithA.get(entry.getKey()));
        }

        for (Map.Entry<WordDefinitionId, C> entry : conjugatedVerbsStartingWithA.entrySet()) {
            assertEqual(entry.getValue(), expectedConjugatedVerbs.get(entry.getKey()));
        }

        Assertions.assertEquals(expectedConjugatedVerbs.size(), conjugatedVerbsStartingWithA.size());
    }
}
