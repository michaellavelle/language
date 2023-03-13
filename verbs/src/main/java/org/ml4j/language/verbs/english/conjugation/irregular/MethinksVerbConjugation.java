package org.ml4j.language.verbs.english.conjugation.irregular;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugationBaseParent;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;
import org.ml4j.language.verbs.english.tenses.Tense;

import java.util.Arrays;
import java.util.List;

public class MethinksVerbConjugation extends VerbConjugationBaseParent implements VerbConjugation {
    @Override
    public String getVerb() {
        return "methinks";
    }

    @Override
    public boolean isModelVerb() {
        return false;
    }

    @Override
    public List<Tense> getSupportedTenses() {
        return Arrays.asList(Tense.PAST_SIMPLE, Tense.PRESENT_SIMPLE);
    }

    @Override
    public List<SubjectType> getSupportedSubjectTypes() {
        return Arrays.asList(SubjectType.NONE);
    }

    @Override
    public int getMeaningId() {
        return 1;
    }

    @Override
    public boolean hasPresentParticiples() {
        return false;
    }

    @Override
    public List<String> getPastTenses(SubjectType subjectType) {
        return Arrays.asList("methought");
    }

    @Override
    public boolean hasPastParticiples() {
        return false;
    }

    @Override
    public List<String> getPastParticiples() {
        throw new UnsupportedOperationException("No part participles defined for this modal verb:" + getVerb());
    }

    @Override
    public List<String> getPresentParticiples() {
        return Arrays.asList("methinking");
    }

    @Override
    public String getPresentTense(SubjectType subjectType) {
        return "methinks";
    }
}
