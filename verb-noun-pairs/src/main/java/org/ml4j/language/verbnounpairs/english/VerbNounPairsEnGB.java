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
package org.ml4j.language.verbnounpairs.english;

import org.ml4j.language.verbnounpairs.mapping.util.VerbNounPair;
import org.ml4j.language.verbnounpairs.mapping.util.VerbNounPairCSVReader;
import org.ml4j.language.words.WordDefinitionId;

import java.util.SortedMap;

/**
 * Statically defined variables to hold the en-GB loaded collections of verb-noun pairs
 *
 * @author Michael Lavelle
 */
public class VerbNounPairsEnGB {


    private final static String VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_ON_MAPPINGS_FILE_PATH = "/english/verb-noun-pairs/en-GB/verb_noun_pairs_nouns_ending_with_on_mappings.csv";
    private final static String VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_NT_MAPPINGS_FILE_PATH = "/english/verb-noun-pairs/en-GB/verb_noun_pairs_nouns_ending_with_nt_mappings.csv";
    private final static String VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_CE_MAPPINGS_FILE_PATH = "/english/verb-noun-pairs/en-GB/verb_noun_pairs_nouns_ending_with_ce_mappings.csv";
    private final static String VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_ER_MAPPINGS_FILE_PATH = "/english/verb-noun-pairs/en-GB/verb_noun_pairs_nouns_ending_with_er_mappings.csv";
    private final static String VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_OR_MAPPINGS_FILE_PATH = "/english/verb-noun-pairs/en-GB/verb_noun_pairs_nouns_ending_with_or_mappings.csv";


    public final static SortedMap<WordDefinitionId, VerbNounPair> ALL_VERB_NOUN_PAIRS = new VerbNounPairCSVReader(false,
            VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_ON_MAPPINGS_FILE_PATH,
            VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_NT_MAPPINGS_FILE_PATH,
            VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_CE_MAPPINGS_FILE_PATH,
            VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_ER_MAPPINGS_FILE_PATH,
            VERB_NOUN_PAIRS_NOUNS_ENDING_WITH_OR_MAPPINGS_FILE_PATH).load();

}
