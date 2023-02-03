/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.ml4j.language.verbs.english.conjugation.irregular;

import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.VerbConjugator;
import org.ml4j.language.verbs.english.conjugation.VerbConjugationLogic;
import org.ml4j.language.verbs.english.conjugation.util.VerbConjugationCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Default implementation for irregular verb conjugation service.
 *
 * @author Michael Lavelle
 */
public class IrregularVerbConjugator implements VerbConjugator<IrregularVerbConjugation> {

    private Map<WordDefinitionId, IrregularVerbConjugation> conjugations;

    public IrregularVerbConjugator(List<String> verbDefinitionFiles) {
        this.conjugations = new VerbConjugationCSVReader<>((i, v) ->
                new IrregularVerbConjugation(v.get(0), i.getMeaningId(), getValuesFromVariables(v, "past_tense", false), getValuesFromVariables(v, "past_participle", false), getValuesFromVariables(v, "present_participle", true)),
                false, verbDefinitionFiles).load();
    }

    private List<String> getValuesFromVariables(List<String> csvVariables, String key, boolean required) {
        String prefix = key + "=";
        List<String> candidates = csvVariables.stream().filter(v -> v.startsWith(prefix)).collect(Collectors.toList());
        if (required && candidates.isEmpty()) {
            throw new IllegalStateException("No value defined for key:" + key + " within:" + csvVariables);
        } else {
            return candidates.stream().map(v -> v.substring(prefix.length())).collect(Collectors.toList());
        }
    }

    @Override
    public IrregularVerbConjugation getConjugatedVerb(WordDefinition verbDefinition) {
        IrregularVerbConjugation matched = conjugations.get(verbDefinition.getWordDefinitionId());

        String presentParticiple = VerbConjugationLogic.getPresentParticiple(EnglishWordsEnUK.ALL_WORDS, verbDefinition);
        if (matched == null) {
            throw new IllegalStateException("Unable to calculate present participle for:" + verbDefinition.getWordDefinitionId());
        }
        if (matched.getPresentParticiples().size() > 1) {
            throw new UnsupportedOperationException("Multiple present participles not yet supported");
        } else if (matched.getPresentParticiples().isEmpty()) {
            throw new IllegalStateException("Unable to calculate present participle for:" + verbDefinition.getWordDefinitionId());
        } else {
            if (!matched.getPresentParticiples().get(0).equals(presentParticiple)) {
                throw new IllegalStateException("Calculated present participle does not match defined present participle:" + verbDefinition.getWordDefinitionId() + ":" + matched.getPresentParticiples().get(0) + ":" + presentParticiple);
            }
        }
        return matched;
    }

    @Override
    public List<IrregularVerbConjugation> getConjugatedVerbs(List<WordDefinition> verbDefinition) {
        return verbDefinition.stream().map(v -> getConjugatedVerb(v)).collect(Collectors.toList());
    }

    @Override
    public SortedMap<WordDefinitionId, IrregularVerbConjugation> getConjugatedVerbs(SortedMap<WordDefinitionId, WordDefinition> verbDefinitions) {
        SortedMap<WordDefinitionId, IrregularVerbConjugation> results = new TreeMap<>();
        for (Map.Entry<WordDefinitionId, WordDefinition> entry : verbDefinitions.entrySet()) {
            results.put(entry.getKey(), getConjugatedVerb(entry.getValue()));
        }
        return results;
    }
}
