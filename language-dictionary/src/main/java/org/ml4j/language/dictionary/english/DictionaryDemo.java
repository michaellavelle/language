package org.ml4j.language.dictionary.english;

import org.ml4j.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4j.language.adverbsnotmappedfromadjectives.english.EnglishAdverbsWithoutAdjectivesEnGB;
import org.ml4j.language.verbnounpairs.english.VerbNounPairsEnGB;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.VerbConjugation;
import org.ml4j.language.verbs.english.conjugation.VerbConjugators;
import org.ml4j.language.verbs.english.conjugation.subjects.SubjectType;
import org.ml4j.language.words.WordDefinition;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DictionaryDemo {

    public static void main(String[] args) throws IOException {

        // Add all verb-related words (so far) to a list, and then remove duplicates
        List<String> words = new ArrayList<>();
        for (WordDefinition wd : EnglishWordsEnGB.ALL_REGULAR_VERBS.values()) {
            VerbConjugation regularVerbConjugation = VerbConjugators.REGULAR_VERB_CONJUGATOR.getConjugatedVerb(wd);
            words.add(wd.getWord());
            if (!regularVerbConjugation.isModelVerb()) {
                words.addAll(regularVerbConjugation.getPresentParticiples());
            }
            for (SubjectType subjectType : SubjectType.values()) {
                words.addAll(regularVerbConjugation.getPastTenses(subjectType));
                words.add(regularVerbConjugation.getPresentTense(subjectType));
            }
        }

        for (WordDefinition wd : EnglishWordsEnGB.ALL_IRREGULAR_VERBS.values()) {
            VerbConjugation iRegularVerbConjugation = VerbConjugators.IRREGULAR_VERB_CONJUGATOR.getConjugatedVerb(wd);
            words.add(wd.getWord());
            if (!iRegularVerbConjugation.isModelVerb()) {
                words.addAll(iRegularVerbConjugation.getPresentParticiples());
                words.addAll(iRegularVerbConjugation.getPastParticiples());
            }
            for (SubjectType subjectType : SubjectType.values()) {
                words.addAll(iRegularVerbConjugation.getPastTenses(subjectType));
                words.add(iRegularVerbConjugation.getPresentTense(subjectType));
            }
        }


        words.addAll(EnglishAdjectiveAdverbPairsEnGB.ALL_WORDS.keySet().stream().map(w -> w.getWord()).collect(Collectors.toList()));
        words.addAll(EnglishAdverbsWithoutAdjectivesEnGB.ALL_WORDS.keySet().stream().map(w -> w.getWord()).collect(Collectors.toList()));
        words.addAll(VerbNounPairsEnGB.ALL_VERB_NOUN_PAIRS.values().stream().map(w -> w.getNoun()).collect(Collectors.toList()));

        words = words.stream().distinct().collect(Collectors.toList());
        Collections.sort(words);
        System.out.println("Number of words so far:" + words.size());
        File outputFile = new File("/Users/michael/stuff/output/languagedictionary.txt");
        try (FileWriter fw = new FileWriter(outputFile)) {
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                for (String word : words) {
                    fw.append(word);
                    fw.append(",");
                    fw.append("\n");
                    fw.flush();
                }
            }
        }
    }
}
