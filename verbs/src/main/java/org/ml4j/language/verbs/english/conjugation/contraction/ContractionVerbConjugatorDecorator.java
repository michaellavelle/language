package org.ml4j.language.verbs.english.conjugation.contraction;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugator;
import org.ml4j.language.words.WordDefinition;

public class ContractionVerbConjugatorDecorator<C extends VerbConjugation> implements VerbConjugator {

    private VerbConjugator<C> decorated;

    public ContractionVerbConjugatorDecorator(VerbConjugator<C> decorated) {
        this.decorated = decorated;
    }

    @Override
    public VerbConjugation getConjugatedVerb(WordDefinition verbDefinition) {
        return new ContractionVerbConjugationDecorator(decorated.getConjugatedVerb(verbDefinition));
    }
}
