package org.ml4j.language.verbs.english.conjugation.irregular;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugationBaseParent;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;

import java.util.Arrays;
import java.util.List;

public class QuothModalVerbConjugation extends VerbConjugationBaseParent implements VerbConjugation {
    @Override
    public String getVerb() {
        return "quoth";
    }

    @Override
    public boolean isModelVerb() {
        return true;
    }

    @Override
    public int getMeaningId() {
        return 1;
    }

    @Override
    public List<String> getPastTenses(SubjectType subjectType) {
        return Arrays.asList("quoth");
    }

    @Override
    public List<String> getPastParticiples() {
        throw new UnsupportedOperationException("No part participles defined for this modal verb:" + getVerb());
    }

    @Override
    public List<String> getPresentParticiples() {
        throw new UnsupportedOperationException("No present participles defined for this modal verb:" + getVerb());
    }

    @Override
    public List<SubjectType> getSupportedSubjectTypes() {
        return Arrays.asList(SubjectType.FIRST_PERSON_SINGULAR, SubjectType.THIRD_PERSON_SINGULAR);
    }

    @Override
    public boolean isSubjectSuffixed() {
        return true;
    }

    @Override
    public String getPresentTense(SubjectType subjectType) {
        return "quoth";
    }
}
