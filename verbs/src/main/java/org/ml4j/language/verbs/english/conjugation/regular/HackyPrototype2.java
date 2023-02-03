
package org.ml4j.language.verbs.english.conjugation.regular;

import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Initial prototype functionality for conjugating English verbs ( British English).
 * <p>
 * Messy code in here - to be tidied up and moved into RegularVerbConjugator.
 * <p>
 * Lots of logic branches - some with inclusions for suffices - could be negated to use exclusions instead.
 * <p>
 * I plan on re-working this logic with the aim of obtaining the simplest logic to conjugate regular verbs.
 * <p>
 * Tested on the entire alphabet of a dataset of verbs I have locally ( not an exhaustive list by any means),
 * but so far I've only committed the set of verbs starting "a" - with more to add over time.
 *
 * @author Michael Lavelle
 */
public class HackyPrototype2 {

    private final static List<String> TEMPORARY_EXCLUSIONS = Arrays.asList("cache", "saute", "flambe", "coif", "pretzel");

    private final static String O = "o";
    private final static String A = "a";
    private final static String M = "m";
    private final static String F = "f";

    private final static String I = "i";
    private final static String Y = "y";
    private final static String C = "c";
    private final static String K = "k";
    private final static String U = "u";
    private final static String V = "v";

    private final static String B = "b";


    private final static String R = "r";
    private final static String E = "e";
    private final static String D = "d";


    private final static String ING = "ing";
    private final static String YING = Y + ING;


    private final static String EE = "ee";
    private final static String IE = "ie";

    private final static String IC = I + C;
    private final static String AC = A + C;

    private final static String ET = "et";
    private final static String EL = "el";
    private final static String ED = "ed";

    private final static String UT = "ut";
    private final static String UP = "up";
    private final static String AP = "ap";
    private final static String AT = "at";

    private final static String AL = "al";
    private final static String IL = "il";
    private final static String IT = "it";


    private final static String MIE = M + IE;

    private final static String UAT = U + AT;

    private final static String BAT = B + AT;

    private final static String MAT = M + AT;

    private final static String MIT = M + IT;

    private final static String FIT = F + IT;

    private final static String UIP = "uip";

    private final static String UIZ = "uiz";

    private final static String VIL = V + IL;

    private final static String FIL = F + IL;

    private final static String CIL = C + IL;

    private final static String RIL = R + IL;

    private final static String IED = I + ED;

    private final static String EEL = E + EL;

    private final static String EAP = E + AP;


    public static void main(String[] args) {

        SortedMap<WordDefinitionId, WordDefinition> allWordDefinitions = EnglishWordsEnUK.ALL_WORDS;


        for (WordDefinition verb : EnglishWordsEnUK.IRREGULAR_VERBS_TYPE_1.values()) {
            if (!TEMPORARY_EXCLUSIONS.contains(verb)) {

                String pastTenseCandidate = getPastTenseCandidate(allWordDefinitions, verb);
                String presentTenseCandidate = getPresentTenseCandidate(allWordDefinitions, verb);

                System.out.println(verb.getWord() + ",past_tense=" + pastTenseCandidate + ",present_participle=" + presentTenseCandidate);
            }
        }
    }

    public static String getPastTenseCandidate(Map<WordDefinitionId, WordDefinition> allWords, WordDefinition verb) {
        // Change to only return one candidate
        String doubleCandidate = addEndingForPastTense(verb.getWord() + verb.getWord().substring(verb.getWord().length() - 1));
        String notDoubleCandidate = addEndingForPastTense(verb.getWord());
        String addKForICOrACOrKEnding = addEndingForPastTense(verb.getWord() + K);
        return getPastTenseCandidate(allWords, verb, doubleCandidate, notDoubleCandidate, addKForICOrACOrKEnding);
    }

    public static String getPresentTenseCandidate(Map<WordDefinitionId, WordDefinition> allWords, WordDefinition verb) {
        // Change to only return one candidate
        String doubleCandidate = addEndingForPresentTense(verb.getWord() + verb.getWord().substring(verb.getWord().length() - 1));
        String notDoubleCandidate = addEndingForPresentTense(verb.getWord());
        String addKForICOrACOrKEnding = addEndingForPresentTense(verb.getWord() + K);
        return getPastTenseCandidate(allWords, verb, doubleCandidate, notDoubleCandidate, addKForICOrACOrKEnding);
    }

    private static boolean isComposite(WordDefinition verb) {
        // TODO
        return verb.getComponents().size() > 1;
    }

    private static boolean isStressOnLastSyllable(WordDefinition verb) {
        return verb.isStressOnLastSyllable();
    }

    private static String getCompositePrefix(WordDefinition verb) {
        // TODO
        return verb.getComponents().get(0);
    }

    private static WordDefinition getWordDefinition(Map<WordDefinitionId, WordDefinition> wordDefinitions, String word) {
        /// TODO make more efficient
        List<WordDefinition> matching = wordDefinitions.values().stream().filter(w -> w.getWord().equals(word)).collect(Collectors.toList());
        if (matching.size() != 1) {
            if (matching.size() > 1) {
                throw new IllegalStateException("Not found: unique definition for:" + word);
            } else {
                throw new IllegalStateException("Not found: definition for:" + word);
            }
        } else {
            return matching.get(0);
        }
    }

    private static String getPastTenseCandidate(Map<WordDefinitionId, WordDefinition> allWords, WordDefinition wordDefinition, String doubleCandidate, String notDoubleCandidate, String addKForICOrACOrKEnding) {
        // Change to only return one candidate
        String verb = wordDefinition.getWord();
        if (verb.length() < 2) {
            throw new IllegalStateException("Verbs must be at least two letters");
        }
        if (isComposite(wordDefinition)) {
            String prefix = getCompositePrefix(wordDefinition);
            if (verb.startsWith(prefix)) {
                String suffixStringIncludingDelimiter = verb.substring(prefix.length());
                String secondWordComponent = wordDefinition.getComponents().get(1);
                int secondWordComponentIndex = suffixStringIncludingDelimiter.indexOf(secondWordComponent);
                if (secondWordComponentIndex == -1) {
                    throw new RuntimeException("Issue with config for verb:" + verb);
                }
                String suffixString = suffixStringIncludingDelimiter.substring(secondWordComponentIndex);

                String delimiter = suffixStringIncludingDelimiter.substring(0, secondWordComponentIndex);

                WordDefinition suffix = getWordDefinition(allWords, suffixString);
                return prefix + delimiter + getPastTenseCandidate(allWords, suffix, doubleCandidate.substring(prefix.length() + delimiter.length()), notDoubleCandidate.substring(prefix.length() + delimiter.length()), addKForICOrACOrKEnding.substring(prefix.length() + delimiter.length()));
            } else {
                throw new IllegalStateException("Invalid prefix for:" + wordDefinition);
            }
        }

        String verbLastLetter = verb.substring(verb.length() - 1);
        String verbLastTwoLetters = verb.substring(verb.length() - 2);


        if (verbLastLetter.equals("c")) {
            if (verb.endsWith(IC) || verb.endsWith(AC)) {
                return addKForICOrACOrKEnding;
            } else {
                return notDoubleCandidate;
            }
            // Do we need this separation - or will the double rules apply ?
        } else if (verbLastLetter.equals(K)) {
            // trek, yak, but not kayak
            if (matchesConsonantVowelConsonantEndingRule(verb) && (verb.endsWith("ek") || (verb.endsWith("ak") && !verb.endsWith("ayak")))) {
                return addKForICOrACOrKEnding;
            } else {
                return notDoubleCandidate;
            }
        } else if (verbLastLetter.equals(Y)) {
            return notDoubleCandidate;
        } else if (Arrays.asList("a", "e", "h", "i", "j", K, "o", "q", U, "w", "x", Y).contains(verbLastLetter)) {
            return notDoubleCandidate;
        } else if (verbLastTwoLetters.equals(ET)) {
            if (verb.endsWith("duet")) {
                return doubleCandidate;
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verbLastTwoLetters.equals(UT)) {
            if (verb.endsWith("input")) {
                return doubleCandidate;
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verbLastTwoLetters.equals(EL)) {
            if (verb.endsWith(EEL)) {
                return notDoubleCandidate;
            } else {
                return doubleCandidate;
            }
        } else if (verbLastTwoLetters.equals(AP)) {
            if (verb.endsWith(EAP)) {
                return notDoubleCandidate;
            } else {
                return doubleCandidate;
            }
        } else if (verbLastTwoLetters.equals(IT)) {
            if ((verb.endsWith("quit") || verb.endsWith(MIT) || verb.endsWith(FIT)) && isStressOnLastSyllable(wordDefinition)) {
                return doubleCandidate;
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verb.length() >= 3 && (verb.endsWith(UAT) || verb.endsWith(MAT) || verb.endsWith(BAT))) {
            return doubleCandidate;
        } else if (verbLastTwoLetters.equals(AL)) {
            if (verb.length() >= 3) {
                String verbLastThreeLetters = verb.substring(verb.length() - 3);
                if (Arrays.asList("ial", "ual", "hal", "val", "ral", "nal", "dal", "tal").contains(verbLastThreeLetters)) {
                    if (verb.endsWith("credential")) {
                        return notDoubleCandidate;
                    } else {
                        return doubleCandidate;
                    }
                } else {
                    return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
                }

            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verbLastTwoLetters.equals(IL)) {
            if (verb.length() >= 3) {
                String verbLastThreeLetters = verb.substring(verb.length() - 3);
                if (Arrays.asList(VIL, FIL, CIL, RIL).contains(verbLastThreeLetters)) {
                    return doubleCandidate;
                } else {
                    return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
                }
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verb.length() >= 3 && verb.endsWith(UIP)) {
            return doubleCandidate;
        } else if (verb.length() >= 3 && verb.endsWith(UIZ)) { // should this be iz ?
            return doubleCandidate;
        } else if (verb.equals(UP)) {
            return doubleCandidate;
        } else {
            // TODO
            return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
        }
    }

    private static String applyDefaultRule(WordDefinition verb, String doubleCandidate, String notDoubleCandidate) {
        if (matchesConsonantVowelConsonantEndingRule(verb.getWord()) && isStressOnLastSyllable(verb)) {
            return doubleCandidate;
        } else {
            return notDoubleCandidate;
        }
    }


    private static boolean matchesEndingWithYConditions(String verb) {
        return endsWithY(verb) && !verb.endsWith("ay") && !verb.endsWith("oy") && !verb.endsWith("ey");
    }

    private static boolean endsWithY(String verb) {
        return verb.endsWith(Y);
    }

    private static boolean matchesConsonantVowelConsonantEndingRule(String word) {
        if (word.length() < 3) {
            return false;
        } else {
            String s1 = word.substring(word.length() - 3, word.length() - 2);
            String s2 = word.substring(word.length() - 2, word.length() - 1);
            String s3 = word.substring(word.length() - 1);
            if (!isVowel(s1) && isVowel(s2) && !isVowel(s3)) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static boolean isVowel(String letter) {
        return Arrays.asList(A, E, I, O, U).contains(letter);
    }

    private static String addEndingForPastTense(String verb) {
        if (matchesEndingWithYConditions(verb)) {
            return verb.substring(0, verb.length() - 1) + IED;
        } else {
            return verb.endsWith(E) ? (verb + D) : (verb + ED);
        }
    }

    private static String addEndingForPresentTense(String verb) {
        if (verb.endsWith(MIE)) {
            return verb + ING;
        } else if (verb.endsWith(IE)) {
            return verb.substring(0, verb.length() - 2) + YING;
        } else if (verb.equals("age")) {
            return verb + ING;
        } else if (verb.endsWith("inge") && !verb.endsWith("ringe")) {
            return verb + ING;
        } else if (verb.endsWith(EE) || verb.endsWith("oe") || verb.endsWith("ye") || ((verb.endsWith("cue") && !verb.endsWith("becue")) && !verb.endsWith("rescue")) || verb.endsWith("eue")) {
            return verb + ING;
        } else if (verb.endsWith(E)) {
            return verb.substring(0, verb.length() - 1) + ING;
        } else {
            return verb + ING;
        }
    }
}