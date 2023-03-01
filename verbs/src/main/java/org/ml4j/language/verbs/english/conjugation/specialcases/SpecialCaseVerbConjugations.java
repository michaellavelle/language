package org.ml4j.language.verbs.english.conjugation.specialcases;

import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugators;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

public class SpecialCaseVerbConjugations {

    private final static WordDefinition TO_HAVE_VERB_DEFINTION = EnglishWordsEnGB.ALL_IRREGULAR_VERBS.get(new WordDefinitionId("have", 1));

    private final static WordDefinition TO_BE_VERB_DEFINTION = EnglishWordsEnGB.ALL_IRREGULAR_VERBS.get(new WordDefinitionId("be", 1));

    public final static VerbConjugation TO_HAVE_VERB_CONJUGATION = VerbConjugators.IRREGULAR_VERB_CONJUGATOR.getConjugatedVerb(TO_HAVE_VERB_DEFINTION);

    public final static VerbConjugation TO_BE_VERB_CONJUGATION = VerbConjugators.IRREGULAR_VERB_CONJUGATOR.getConjugatedVerb(TO_BE_VERB_DEFINTION);

}
