package org.ml4j.language.verbs.english.demo.specialcases.modalverbs;

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

public class OughtModelVerbConjugationDemo {

    public static void main(String[] args) {

        // Add all verb-related words (so far) to a list, and then remove duplicates
        List<String> verbRelatedWords = new ArrayList<>();

        VerbConjugation iRegularVerbConjugation = VerbConjugators.IRREGULAR_VERB_CONJUGATOR.getConjugatedVerb(EnglishWordsEnGB.ALL_IRREGULAR_VERBS.get(WordDefinitionId.create("ought", 1)));

        verbRelatedWords.add(iRegularVerbConjugation.getVerb());
        if (!iRegularVerbConjugation.isModelVerb()) {
            verbRelatedWords.addAll(iRegularVerbConjugation.getPresentParticiples());
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
        if (SubjectType.FIRST_PERSON_SINGULAR.equals(subjectType)) {
            return "I";
        } else if (SubjectType.FIRST_PERSON_PLURAL.equals(subjectType)) {
            return "We";
        }else if (SubjectType.SECOND_PERSON_SINGULAR.equals(subjectType)) {
            return "You";
        } else if (SubjectType.SECOND_PERSON_PLURAL.equals(subjectType)) {
            return "You";
        }else if (SubjectType.THIRD_PERSON_SINGULAR.equals(subjectType)) {
            return "He";
        } else if (SubjectType.THIRD_PERSON_PLURAL.equals(subjectType)) {
            return "They";
        } else {
            throw new IllegalArgumentException("Unknown subject type:" + subjectType);
        }
    }
}
