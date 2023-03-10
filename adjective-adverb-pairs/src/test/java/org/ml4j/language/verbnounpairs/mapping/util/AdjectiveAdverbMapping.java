package org.ml4j.language.verbnounpairs.mapping.util;

import java.util.List;

public class AdjectiveAdverbMapping {
    private String adjective;

    private int adjectiveMeaningId;
    private List<String> adverbs;

    public int getAdjectiveMeaningId() {
        return adjectiveMeaningId;
    }

    public AdjectiveAdverbMapping(String adjective, int adjectiveMeaningId, List<String> adverbs) {
        this.adjective = adjective;
        this.adjectiveMeaningId = adjectiveMeaningId;
        this.adverbs = adverbs;
    }

    public String getAdjective() {
        return adjective;
    }

    public List<String> getAdverbs() {
        return adverbs;
    }
}
