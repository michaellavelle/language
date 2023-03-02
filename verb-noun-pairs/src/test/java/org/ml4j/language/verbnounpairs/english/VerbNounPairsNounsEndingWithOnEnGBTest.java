package org.ml4j.language.verbnounpairs.english;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ml4.language.verbnounpairs.english.VerbNounPairsEnGB;
import org.ml4.language.verbnounpairs.mapping.util.VerbNounPair;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VerbNounPairsNounsEndingWithOnEnGBTest {

    @Test
    public void testVerbNounPairsLoad() {
        Assertions.assertEquals(545, VerbNounPairsEnGB.ALL_VERB_NOUN_PAIRS.size());
        List<String> knownVerbs = EnglishWordsEnGB.ALL_VERBS.keySet().stream().map(w -> w.getWord()).collect(Collectors.toList());
        for (Map.Entry<WordDefinitionId, VerbNounPair> verbNounPair : VerbNounPairsEnGB.ALL_VERB_NOUN_PAIRS.entrySet()) {
            String noun = verbNounPair.getValue().getNoun();
            Assertions.assertTrue(noun.endsWith("on"), "Noun:" + noun + " doesn't end with 'on'");
            String verbFromKey = verbNounPair.getKey().getWord();
            String verbFromValue = verbNounPair.getValue().getVerb();
            Assertions.assertEquals(verbFromKey, verbFromValue, "Verb from key:" + verbFromKey + " doesn't equal verb from value:" + verbFromValue);
            Assertions.assertTrue(knownVerbs.contains(verbFromKey), "Unknown verb:" + verbFromKey);
        }
    }
}
