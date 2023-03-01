package org.ml4j.language.adverbsnotmappedfromadjectives.english;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdverbsWithoutAdjectivesEnGB;

public class EnglishAdverbsWithoutAdjectivesEnGBTest {

    @Test
    public void testAdverbLoad() {
        Assertions.assertEquals(47, EnglishAdverbsWithoutAdjectivesEnGB.ALL_ADVERBS.keySet().size());
    }
}
