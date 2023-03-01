package org.ml4j.language.verbs.english.demo;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.specialcases.SpecialCaseVerbConjugations;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;
import org.ml4j.language.verbs.english.tenses.Tense;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ToHaveVerbConjugationDemo {

    public static void main(String[] args) {

        // Add all verb-related words (so far) to a list, and then remove duplicates
        List<String> verbRelatedWords = new ArrayList<>();

        VerbConjugation iRegularVerbConjugation = SpecialCaseVerbConjugations.TO_HAVE_VERB_CONJUGATION;

        verbRelatedWords.add(iRegularVerbConjugation.getVerb());
        verbRelatedWords.addAll(iRegularVerbConjugation.getPresentParticiples());
        verbRelatedWords.addAll(iRegularVerbConjugation.getPastParticiples());
        for (SubjectType subjectType : SubjectType.values()) {
            verbRelatedWords.addAll(iRegularVerbConjugation.getPastTenses(subjectType));
            verbRelatedWords.add(iRegularVerbConjugation.getPresentTense(subjectType));
            for (Tense tense : Tense.values()) {
                List<String> conjugations = iRegularVerbConjugation.conjugateVerb(getDefaultSubjectName(subjectType), subjectType, tense);
                System.out.println(tense + ":" + subjectType + ":" + conjugations);
            }
        }
        verbRelatedWords = verbRelatedWords.stream().distinct().collect(Collectors.toList());
        Collections.sort(verbRelatedWords);
        System.out.println("Verb related words:" + verbRelatedWords);
    }

    private static String getDefaultSubjectName(SubjectType subjectType) {
        if (SubjectType.FIRST_PERSON_SINGULAR.equals(subjectType)) {
            return "I";
        } else if (SubjectType.FIRST_PERSON_PLURAL.equals(subjectType)) {
            return "We";
        } else if (SubjectType.SECOND_PERSON.equals(subjectType)) {
            return "You";
        } else if (SubjectType.THIRD_PERSON_SINGULAR.equals(subjectType)) {
            return "He";
        } else if (SubjectType.THIRD_PERSON_PLURAL.equals(subjectType)) {
            return "They";
        } else {
            throw new IllegalArgumentException("Unknown subject type:" + subjectType);
        }
    }
}
