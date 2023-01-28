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

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;

import java.util.Objects;

/**
 * Default value object for the results of a regular Verb conjugation
 *
 * @author Michael Lavelle
 */
public class RegularVerbConjugation implements VerbConjugation {

    private String verb;
    private String pastTense;
    private String presentParticiple;

    public RegularVerbConjugation(String verb, String pastTense, String presentParticiple) {
        this.verb = verb;
        this.pastTense = pastTense;
        this.presentParticiple = presentParticiple;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularVerbConjugation that = (RegularVerbConjugation) o;
        return Objects.equals(verb, that.verb) &&
                Objects.equals(pastTense, that.pastTense) &&
                Objects.equals(presentParticiple, that.presentParticiple);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verb, pastTense, presentParticiple);
    }

    @Override
    public String toString() {
        return "RegularVerbConjugation{" +
                "verb='" + verb + '\'' +
                ", pastTense='" + pastTense + '\'' +
                ", presentParticiple='" + presentParticiple + '\'' +
                '}';
    }

    public String getVerb() {
        return verb;
    }

    public String getPastTense() {
        return pastTense;
    }

    public String getPresentParticiple() {
        return presentParticiple;
    }


}
