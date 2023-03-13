package org.ml4j.language.verbs.english.demo.specialcases;

import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugators;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;
import org.ml4j.language.verbs.english.tenses.Tense;
import org.ml4j.language.words.WordDefinitionId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethinksVerbConjugationDemo {

    public static void main(String[] args) {

        // Add all verb-related words (so far) to a list, and then remove duplicates
        List<String> verbRelatedWords = new ArrayList<>();

        VerbConjugation iRegularVerbConjugation = VerbConjugators.IRREGULAR_VERB_CONJUGATOR.getConjugatedVerb(EnglishWordsEnGB.ALL_IRREGULAR_VERBS.get(WordDefinitionId.create("methinks", 1)));

        verbRelatedWords.add(iRegularVerbConjugation.getVerb());
        if (iRegularVerbConjugation.hasPresentParticiples()) {
            verbRelatedWords.addAll(iRegularVerbConjugation.getPresentParticiples());
        }
        if (iRegularVerbConjugation.hasPastParticiples()) {
            verbRelatedWords.addAll(iRegularVerbConjugation.getPastParticiples());
        }
        for (SubjectType subjectType : iRegularVerbConjugation.getSupportedSubjectTypes()) {
            verbRelatedWords.addAll(iRegularVerbConjugation.getPastTenses(subjectType));
            verbRelatedWords.add(iRegularVerbConjugation.getPresentTense(subjectType));
            for (Tense tense : iRegularVerbConjugation.getSupportedTenses()) {
                List<String> conjugations = iRegularVerbConjugation.conjugateVerb(getDefaultSubjectName(subjectType), subjectType, tense);
                System.out.println(tense + ":" + subjectType + ":" + conjugations);
            }
        }
        verbRelatedWords = verbRelatedWords.stream().distinct().collect(Collectors.toList());
        Collections.sort(verbRelatedWords);
        System.out.println("Verb related words:" + verbRelatedWords);
    }

    private static String getDefaultSubjectName(SubjectType subjectType) {
        if (SubjectType.NONE.equals(subjectType)) {
            return "";
        } else {
            throw new IllegalArgumentException("Unknown subject type:" + subjectType);
        }
    }
}
