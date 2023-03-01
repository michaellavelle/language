package org.ml4j.language.verbs.english.conjugation;

import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugator;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugator;

import java.util.Arrays;

public class VerbConjugators {

    private final static String IRREGULAR_VERBS_TYPE_1_CONJUGATIONS_FILE_PATH = "/english/irregular/en-GB/irregular_verbs_type_1_conjugations.csv";
    private final static String IRREGULAR_VERBS_TYPE_2_CONJUGATIONS_FILE_PATH = "/english/irregular/en-GB/irregular_verbs_type_2_conjugations.csv";

    public final static IrregularVerbConjugator IRREGULAR_VERB_CONJUGATOR = new IrregularVerbConjugator(Arrays.asList(IRREGULAR_VERBS_TYPE_1_CONJUGATIONS_FILE_PATH, IRREGULAR_VERBS_TYPE_2_CONJUGATIONS_FILE_PATH));

    public final static RegularVerbConjugator REGULAR_VERB_CONJUGATOR = new RegularVerbConjugator();

}
