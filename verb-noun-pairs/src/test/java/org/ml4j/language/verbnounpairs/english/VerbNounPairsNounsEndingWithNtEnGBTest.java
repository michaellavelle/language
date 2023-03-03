package org.ml4j.language.verbnounpairs.english;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ml4.language.verbnounpairs.english.VerbNounPairsEnGB;
import org.ml4.language.verbnounpairs.mapping.util.VerbNounPair;
import org.ml4j.language.verbnounpairs.english.base.VerbNounPairsNounsEndingWithEnGBTestBase;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.words.WordDefinitionId;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VerbNounPairsNounsEndingWithNtEnGBTest extends VerbNounPairsNounsEndingWithEnGBTestBase {

    @Test
    public void testVerbNounPairsLoad() {
        testVerbNounPairsLoad("nt",  230);
    }
}
