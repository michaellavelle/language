package org.ml4j.language.verbnounpairs.mapping.util;

public class VerbNounPair {
    private String verb;

    private int verbOccurrenceId;
    private String noun;

    public int getVerbOccurrenceId() {
        return verbOccurrenceId;
    }

    public VerbNounPair(String verb, int verbOccurrenceId, String noun) {
        this.verb = verb;
        this.verbOccurrenceId = verbOccurrenceId;
        this.noun = noun;
    }

    public String getVerb() {
        return verb;
    }

    public String getNoun() {
        return noun;
    }
}
