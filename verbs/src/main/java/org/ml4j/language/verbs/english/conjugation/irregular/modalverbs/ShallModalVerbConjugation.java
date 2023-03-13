package org.ml4j.language.verbs.english.conjugation.irregular.modalverbs;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugationBaseParent;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;

import java.util.Arrays;
import java.util.List;

public class ShallModalVerbConjugation extends VerbConjugationBaseParent implements VerbConjugation {
    @Override
    public String getVerb() {
        return "shall";
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
        return Arrays.asList("shall");
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
    public String getPresentTense(SubjectType subjectType) {
        return "shall";
    }
}
