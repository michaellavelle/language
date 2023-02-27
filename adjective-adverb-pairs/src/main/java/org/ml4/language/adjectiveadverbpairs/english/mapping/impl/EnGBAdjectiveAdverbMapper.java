package org.ml4.language.adjectiveadverbpairs.english.mapping.impl;

import org.ml4.language.adjectiveadverbpairs.english.mapping.AdjectiveAdverbMapper;

public class EnGBAdjectiveAdverbMapper implements AdjectiveAdverbMapper {

    private final static String D = "d";
    private final static String R = "r";
    private final static String O = "o";
    private final static String W = "w";
    private final static String A = "a";
    private final static String L = "l";
    private final static String I = "i";
    private final static String B = "b";
    private final static String C = "c";
    private final static String Y = "y";
    private final static String E = "e";

    private final static String S = "s";

    private final static String UE = "ue";
    private final static String IE = "ie";
    private final static String DUE = D + UE;
    private final static String RUE = R + UE;
    private final static String RIE = R + IE;
    private final static String OY = O + Y;
    private final static String RY = R + Y;

    private final static String DRY = D + RY;
    private final static String WRY = W + RY;

    private final static String LE = L + E;
    private final static String LY = L + Y;

    private final static String LL = L + L;

    private final static String AL = A + L;
    private final static String ALLY = AL + LY;
    private final static String ILY = I + LY;

    private final static String OLE = O + LE;

    private final static String SLY = S + LY;

    private final static String IC = I + C;
    private final static String BL = B + L;
    private final static String BLIC = BL + IC;

    @Override
    public String getAdverbFromAdjective(String adjective) {
        if (adjective.endsWith(DUE) || adjective.endsWith(RUE) || adjective.endsWith(RIE) || adjective.endsWith(OLE)) {
            // due, eerie, true, undue, whole
            return adjective.substring(0, adjective.length() - 1) + LY;
        } else if (adjective.endsWith(LE)) {
            // covers ble, ple, tle
            return adjective.substring(0, adjective.length()- 1) + Y;
        } else if (adjective.endsWith(IC) && !adjective.endsWith(BLIC)) { // excludes public, but includes symbolic
            return adjective + ALLY;
        } else if (adjective.endsWith(RY) && !adjective.endsWith(DRY) && !adjective.endsWith(WRY)) { // excludes public, but includes symbolic
            return adjective.substring(0, adjective.length() - 1) + ILY;
        }
        else if (adjective.endsWith(Y) && !adjective.endsWith(OY) && !adjective.endsWith(RY) && !adjective.endsWith(SLY)) { // slyly
            return adjective.substring(0, adjective.length()- 1) + ILY;
        } else if (adjective.endsWith(LL)) { // full/fully
            return adjective + Y;
        }
        else {
            return adjective + LY;
        }
    }
    @Override
    public String getAdjectiveFromAdverb(String adverb) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
