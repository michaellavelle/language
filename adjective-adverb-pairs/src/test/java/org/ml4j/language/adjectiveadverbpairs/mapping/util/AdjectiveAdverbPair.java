package org.ml4j.language.adjectiveadverbpairs.mapping.util;

public class AdjectiveAdverbPair {
    private String adjective;

    private int adjectiveMeaningId;
    private String adverb;

    public int getAdjectiveMeaningId() {
        return adjectiveMeaningId;
    }

    public AdjectiveAdverbPair(String adjective, int adjectiveMeaningId, String adverb) {
        this.adjective = adjective;
        this.adjectiveMeaningId = adjectiveMeaningId;
        this.adverb = adverb;
    }

    public String getAdjective() {
        return adjective;
    }

    public String getAdverb() {
        return adverb;
    }
}
