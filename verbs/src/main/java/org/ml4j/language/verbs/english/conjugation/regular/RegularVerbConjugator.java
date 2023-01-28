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
package org.ml4j.language.verbs.english.conjugation.regular;

import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.VerbConjugator;
import org.ml4j.language.words.WordDefinition;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Default implementation for regular verb conjugation service.
 *
 * @author Michael Lavelle
 */
public class RegularVerbConjugator implements VerbConjugator<RegularVerbConjugation> {

    @Override
    public RegularVerbConjugation getConjugatedVerb(WordDefinition verbDefinition) {
        String pastTense = HackyPrototypeHelper.getPastTenseCandidate(EnglishWordsEnUK.ALL_WORDS, verbDefinition);
        String presentParticiple = HackyPrototypeHelper.getPresentTenseCandidate(EnglishWordsEnUK.ALL_WORDS, verbDefinition);
        return new RegularVerbConjugation(verbDefinition.getWord(), pastTense, presentParticiple);
    }

    @Override
    public List<RegularVerbConjugation> getConjugatedVerbs(List<WordDefinition> verbDefinition) {
        return verbDefinition.stream().map(v -> getConjugatedVerb(v)).collect(Collectors.toList());
    }
}
