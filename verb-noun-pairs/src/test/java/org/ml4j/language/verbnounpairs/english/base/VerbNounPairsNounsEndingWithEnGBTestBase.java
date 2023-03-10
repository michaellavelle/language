package org.ml4j.language.verbnounpairs.english.base;

import org.junit.jupiter.api.Assertions;
import org.ml4j.language.verbnounpairs.english.VerbNounPairsEnGB;
import org.ml4j.language.verbnounpairs.mapping.util.VerbNounPair;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.words.WordDefinitionId;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VerbNounPairsNounsEndingWithEnGBTestBase {

    protected void testVerbNounPairsLoad(String suffix, int expectedCount) {
        List<String> knownVerbs = EnglishWordsEnGB.ALL_VERBS.keySet().stream().map(w -> w.getWord()).collect(Collectors.toList());
        int count = 0;
        List<String> alreadySeen = new ArrayList<>();
        for (Map.Entry<WordDefinitionId, VerbNounPair> verbNounPair : VerbNounPairsEnGB.ALL_VERB_NOUN_PAIRS.entrySet()) {
            String noun = verbNounPair.getValue().getNoun();
            if (noun.endsWith(suffix)) {
                if (alreadySeen.contains(noun)) {
                    throw new IllegalStateException("Duplicate noun:" + noun);
                }
                alreadySeen.add(noun);
                Assertions.assertTrue(noun.endsWith(suffix), "Noun:" + noun + " doesn't end with '" + suffix + "'");
                String verbFromKey = verbNounPair.getKey().getWord();
                String verbFromValue = verbNounPair.getValue().getVerb();

                Assertions.assertEquals(verbFromKey, verbFromValue, "Verb from key:" + verbFromKey + " doesn't equal verb from value:" + verbFromValue);
                Assertions.assertTrue(knownVerbs.contains(verbFromKey), "Unknown verb:" + verbFromKey);
                count++;
            }
        }
        Assertions.assertEquals(expectedCount, count);
    }
}
