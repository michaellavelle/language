package org.ml4j.language.verbs.english.demo;

import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.words.WordDefinitionId;

import java.util.stream.Collectors;

public class OverlapTester {
    public static void main(String[] args) {

        for (WordDefinitionId wd : EnglishWordsEnGB.ALL_REGULAR_VERBS.keySet()) {
            for (WordDefinitionId overlap : EnglishWordsEnGB.ALL_IRREGULAR_VERBS.keySet().stream().filter(w -> w.getWord().equals(wd.getWord())).collect(Collectors.toList())) {
                System.out.println(wd + ":" + overlap);
            }
        }
        for (WordDefinitionId wd : EnglishWordsEnGB.IRREGULAR_VERBS_TYPE_2.keySet()) {
            for (WordDefinitionId overlap : EnglishWordsEnGB.IRREGULAR_VERBS_TYPE_1.keySet().stream().filter(w -> w.getWord().equals(wd.getWord())).collect(Collectors.toList())) {
                System.out.println(wd + ":" + overlap);
            }
        }
        for (WordDefinitionId wd : EnglishWordsEnGB.IRREGULAR_VERBS_TYPE_1.keySet()) {
            for (WordDefinitionId overlap : EnglishWordsEnGB.IRREGULAR_VERBS_TYPE_2.keySet().stream().filter(w -> w.getWord().equals(wd.getWord())).collect(Collectors.toList())) {
                System.out.println(wd + ":" + overlap);
            }
        }

    }
}
