package org.ml4j.language.verbs.english.demo;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.specialcases.SpecialCaseVerbConjugations;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;

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
        }
        verbRelatedWords = verbRelatedWords.stream().distinct().collect(Collectors.toList());
        Collections.sort(verbRelatedWords);
        System.out.println("Verb related words:" + verbRelatedWords);
    }
}
