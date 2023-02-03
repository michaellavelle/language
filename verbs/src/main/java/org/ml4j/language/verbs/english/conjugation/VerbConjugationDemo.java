package org.ml4j.language.verbs.english.conjugation;

import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.irregular.IrregularVerbConjugator;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugator;
import org.ml4j.language.words.WordDefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerbConjugationDemo {

    private final static String IRREGULAR_VERBS_TYPE_1_CONJUGATIONS_FILE_PATH = "/english/irregular/en_UK/irregular_verbs_type_1_conjugations.csv";
    private final static String IRREGULAR_VERBS_TYPE_2_CONJUGATIONS_FILE_PATH = "/english/irregular/en_UK/irregular_verbs_type_2_conjugations.csv";

    public static void main(String[] args) {

        // Create our conjugators, one for regular verbs and the other for irregular
        RegularVerbConjugator regularVerbConjugator = new RegularVerbConjugator();
        IrregularVerbConjugator irregularVerbConjugator = new IrregularVerbConjugator(Arrays.asList(IRREGULAR_VERBS_TYPE_1_CONJUGATIONS_FILE_PATH, IRREGULAR_VERBS_TYPE_2_CONJUGATIONS_FILE_PATH));

        // Add all verb-related words (so far) to a list, and then remove duplicates
        // Todo add present tense for third person singular ( usually infinitive + "s" (or "es") - eg "eats", "runs", "does" etc)
        List<String> verbRelatedWords = new ArrayList<>();
        for (WordDefinition wd : EnglishWordsEnUK.ALL_REGULAR_VERBS.values()) {
            RegularVerbConjugation regularVerbConjugation = regularVerbConjugator.getConjugatedVerb(wd);
            verbRelatedWords.add(wd.getWord());
            verbRelatedWords.addAll(regularVerbConjugation.getPresentParticiples());
            verbRelatedWords.addAll(regularVerbConjugation.getPastTenses());
        }

        for (WordDefinition wd : EnglishWordsEnUK.ALL_IRREGULAR_VERBS.values()) {
            IrregularVerbConjugation iRegularVerbConjugation = irregularVerbConjugator.getConjugatedVerb(wd);
            verbRelatedWords.add(wd.getWord());
            verbRelatedWords.addAll(iRegularVerbConjugation.getPresentParticiples());
            verbRelatedWords.addAll(iRegularVerbConjugation.getPastTenses());
            verbRelatedWords.addAll(iRegularVerbConjugation.getPastParticiples());
        }
        verbRelatedWords = verbRelatedWords.stream().distinct().collect(Collectors.toList());
        System.out.println("Number of verb related words so far:" + verbRelatedWords.size());
    }
}
