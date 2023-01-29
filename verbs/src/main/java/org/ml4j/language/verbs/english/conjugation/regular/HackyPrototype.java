/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.ml4j.language.verbs.english.conjugation.regular;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.verbs.english.EnglishWordsEnUK;
import org.ml4j.language.words.WordDefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HackyPrototype {

    private final static List<String> TEMPORARY_EXCLUSIONS = Arrays.asList("cache", "saute", "flambe", "coif", "pretzel");

    private final static String ING = "ing";
    private final static String EE = "ee";
    private final static String IE = "ie";
    private final static String M = "m";
    private final static String Y = "y";
    private final static String K = "k";

    private final static String MIE = M + IE;


    public static void main(String[] args) {

        List<WordDefinition> allWordDefinitions = EnglishWordsEnUK.ALL_WORDS;


        List<WordDefinition> allWords = new ArrayList<>();
        allWords.addAll(allWordDefinitions);
        // TEMP


        for (WordDefinition verb : EnglishWordsEnUK.VERBS_STARTING_WITH_C) {
            if (!TEMPORARY_EXCLUSIONS.contains(verb)) {

                String pastTenseCandidate = getPastTenseCandidate(allWords, verb);
                String presentTenseCandidate = getPresentTenseCandidate(allWords, verb);

                System.out.println(verb.getWord() + ",past_tense=" + pastTenseCandidate + ",present_participle=" + presentTenseCandidate);
            }
        }
    }

    public static String getPastTenseCandidate(List<WordDefinition> allWords, WordDefinition verb) {
        // Change to only return one candidate
        String doubleCandidate = addEndingForPastTense(verb.getWord() + verb.getWord().substring(verb.getWord().length() - 1));
        String notDoubleCandidate = addEndingForPastTense(verb.getWord());
        String addKForICOrACOrKEnding = addEndingForPastTense(verb.getWord() + K);
        return getPastTenseCandidate(allWords, verb, doubleCandidate, notDoubleCandidate, addKForICOrACOrKEnding);
    }

    public static String getPresentTenseCandidate(List<WordDefinition> allWords, WordDefinition verb) {
        // Change to only return one candidate
        String doubleCandidate = addEndingForPresentTense(verb.getWord() + verb.getWord().substring(verb.getWord().length() - 1));
        String notDoubleCandidate = addEndingForPresentTense(verb.getWord());
        String addKForICOrACOrKEnding = addEndingForPresentTense(verb + K);
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

    private static WordDefinition getWordDefinition(List<WordDefinition> wordDefinitions, String word) {
        /// TODO make more efficient
        List<WordDefinition> matching = wordDefinitions.stream().filter(w -> w.getWord().equals(word)).collect(Collectors.toList());
        if (matching.size() != 1) {
            throw new IllegalStateException("Not found unique definition for:" + word);
        } else {
            return matching.get(0);
        }
    }

    private static String getPastTenseCandidate(List<WordDefinition> allWords, WordDefinition wordDefinition, String doubleCandidate, String notDoubleCandidate, String addKForICOrACOrKEnding) {
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
                String suffixString = suffixStringIncludingDelimiter.substring(secondWordComponentIndex);

                String delimiter = suffixStringIncludingDelimiter.substring(0, secondWordComponentIndex);

                WordDefinition suffix = getWordDefinition(allWords, suffixString);
                return prefix + delimiter + getPastTenseCandidate(allWords, suffix, doubleCandidate.substring(prefix.length() + delimiter.length()), notDoubleCandidate.substring(prefix.length() + delimiter.length()), addKForICOrACOrKEnding.substring(prefix.length() + delimiter.length()));
            } else {
                throw new IllegalStateException("Invalid prefix");
            }
        }

        String verbLastLetter = verb.substring(verb.length() - 1);
        String verbLastTwoLetters = verb.substring(verb.length() - 2);


        if (verbLastLetter.equals("c")) {
            if (verb.endsWith("ic") || verb.endsWith("ac")) {
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
        } else if (Arrays.asList("a", "e", "h", "i", "j", K, "o", "q", "u", "w", "x", Y).contains(verbLastLetter)) {
            return notDoubleCandidate;
        } else if (verbLastTwoLetters.equals("et")) {
            if (verb.endsWith("duet")) {
                return doubleCandidate;
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verbLastTwoLetters.equals("ut")) {
            if (verb.endsWith("input")) {
                return doubleCandidate;
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verbLastTwoLetters.equals("el")) {
            if (verb.endsWith("eel")) {
                return notDoubleCandidate;
            } else {
                return doubleCandidate;
            }
        } else if (verbLastTwoLetters.equals("ap")) {
            if (verb.endsWith("eap")) {
                return notDoubleCandidate;
            } else {
                return doubleCandidate;
            }
        } else if (verbLastTwoLetters.equals("it")) {
            if ((verb.endsWith("quit") || verb.endsWith("mit") || verb.endsWith("fit")) && isStressOnLastSyllable(wordDefinition)) {
                return doubleCandidate;
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verb.length() >= 3 && (verb.endsWith("uat") || verb.endsWith("mat") || verb.endsWith("bat"))) {
            return doubleCandidate;
        } else if (verbLastTwoLetters.equals("al")) {
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
        } else if (verbLastTwoLetters.equals("il")) {
            if (verb.length() >= 3) {
                String verbLastThreeLetters = verb.substring(verb.length() - 3);
                if (Arrays.asList("vil", "fil", "cil", "ril").contains(verbLastThreeLetters)) {
                    return doubleCandidate;
                } else {
                    return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
                }
            } else {
                return applyDefaultRule(wordDefinition, doubleCandidate, notDoubleCandidate);
            }
        } else if (verbLastTwoLetters.equals("up")) {
            return doubleCandidate;
        } else if (verb.length() >= 3 && verb.endsWith("uip")) {
            return doubleCandidate;
        } else if (verb.length() >= 3 && verb.endsWith("uiz")) { // should this be iz ?
            return doubleCandidate;
        } else if (verb.equals("up")) {
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
        //System.out.println("Matches?" + word);
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
        return Arrays.asList("a", "e", "i", "o", "u").contains(letter);
    }


    private static String addEndingForPastTense(String verb) {
        if (matchesEndingWithYConditions(verb)) {
            return verb.substring(0, verb.length() - 1) + "ied";
        } else {
            return verb.endsWith("e") ? (verb + "d") : (verb + "ed");
        }
    }

    private static String addEndingForPresentTense(String verb) {
        if (verb.endsWith(MIE)) {
            return verb + ING;
        } else if (verb.endsWith(IE)) {
            return verb.substring(0, verb.length() - 2) + "ying";
        } else if (verb.equals("age")) {
            return verb + ING;
        } else if (verb.endsWith("inge") && !verb.endsWith("ringe")) {
            return verb + ING;
        } else if (verb.endsWith(EE) || verb.endsWith("oe") || verb.endsWith("ye") || ((verb.endsWith("cue") && !verb.endsWith("becue")) && !verb.endsWith("rescue")) || verb.endsWith("eue")) {
            return verb + ING;
        } else if (verb.endsWith("e")) {
            return verb.substring(0, verb.length() - 1) + ING;
        } else {
            return verb + ING;
        }
    }
}

