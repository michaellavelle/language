package org.ml4j.language.verbnounpairs.english;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbnounpairs.english.base.VerbNounPairsNounsEndingWithEnGBTestBase;

public class VerbNounPairsNounsEndingWithOnEnGBTest extends VerbNounPairsNounsEndingWithEnGBTestBase {

    @Test
    public void testVerbNounPairsLoad() {
        testVerbNounPairsLoad("on", 752);
    }
}
