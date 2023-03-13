package org.ml4j.language.verbs.english.conjugation.irregular;

import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugationBaseParent;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;

import java.util.Arrays;
import java.util.List;

public class ToBeVerbConjugation extends VerbConjugationBaseParent implements VerbConjugation {
    @Override
    public String getVerb() {
        return "be";
    }

    @Override
    public boolean isModelVerb() {
        return false;
    }

    @Override
    public int getMeaningId() {
        return 1;
    }

    @Override
    public List<String> getPastTenses(SubjectType subjectType) {
        if (SubjectType.FIRST_PERSON_SINGULAR.equals(subjectType)) {
            return Arrays.asList("was");
        } else if (SubjectType.FIRST_PERSON_PLURAL.equals(subjectType)) {
            return Arrays.asList("were");
        } else if (SubjectType.SECOND_PERSON_SINGULAR.equals(subjectType) || SubjectType.SECOND_PERSON_PLURAL.equals(subjectType)) {
            return Arrays.asList("were");
        } else if (SubjectType.THIRD_PERSON_SINGULAR.equals(subjectType)) {
            return Arrays.asList("was");
        } else if (SubjectType.THIRD_PERSON_PLURAL.equals(subjectType)) {
            return Arrays.asList("were");
        } else {
            throw new IllegalArgumentException("Unsupported subject type:" + subjectType);
        }
    }

    @Override
    public List<String> getPastParticiples() {
        return Arrays.asList("been");
    }

    @Override
    public List<String> getPresentParticiples() {
        return Arrays.asList("being");
    }

    @Override
    public String getPresentTense(SubjectType subjectType) {
        if (SubjectType.FIRST_PERSON_SINGULAR.equals(subjectType)) {
            return "am";
        } else if (SubjectType.FIRST_PERSON_PLURAL.equals(subjectType)) {
            return "are";
        } else if (SubjectType.SECOND_PERSON_SINGULAR.equals(subjectType) || SubjectType.SECOND_PERSON_PLURAL.equals(subjectType) ) {
            return "are";
        } else if (SubjectType.THIRD_PERSON_SINGULAR.equals(subjectType)) {
            return "is";
        } else if (SubjectType.THIRD_PERSON_PLURAL.equals(subjectType)) {
            return "are";
        } else {
            throw new IllegalArgumentException("Unsupported subject type:" + subjectType);
        }
    }
}
