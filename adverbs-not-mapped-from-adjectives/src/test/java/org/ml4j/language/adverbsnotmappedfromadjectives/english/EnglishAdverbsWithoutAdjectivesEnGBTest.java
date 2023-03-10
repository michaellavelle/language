package org.ml4j.language.adverbsnotmappedfromadjectives.english;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnglishAdverbsWithoutAdjectivesEnGBTest {

    @Test
    public void testAdverbLoad() {
        Assertions.assertEquals(47, EnglishAdverbsWithoutAdjectivesEnGB.ALL_ADVERBS.keySet().size());
    }
}
