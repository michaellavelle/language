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

import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugationLogic;
import org.ml4j.language.verbs.english.conjugation.VerbConjugator;
import org.ml4j.language.words.WordDefinition;

/**
 * Default implementation for regular verb conjugation service.
 *
 * @author Michael Lavelle
 */
public class RegularVerbConjugator implements VerbConjugator<VerbConjugation> {

    @Override
    public VerbConjugation getConjugatedVerb(WordDefinition verbDefinition) {
        String pastTense = VerbConjugationLogic.getPastTenseForRegularVerb(EnglishWordsEnGB.ALL_WORDS, verbDefinition);
        String presentParticiple = VerbConjugationLogic.getPresentParticiple(EnglishWordsEnGB.ALL_WORDS, verbDefinition);
        return new RegularVerbConjugation(verbDefinition.getWord(), verbDefinition.getWordDefinitionId().getMeaningId(), pastTense, presentParticiple);
    }
}
