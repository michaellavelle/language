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
package org.ml4j.language.adverbsnotmappedfromadjectives.english;

import org.ml4j.language.core.util.WordDefinitionCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Statically defined variables to hold the en-GB loaded collections of adverbs (without corresponding adjectives)
 *
 * @author Michael Lavelle
 */
public class EnglishAdverbsWithoutAdjectivesEnGB {


    private final static String ADVERBS_WITHOUT_ADJECTIVES_FILE_PATH = "/english/adverbs-not-mapped-from-adjectives/adverbs/en-GB/adverbs_not_mapped_from_adjectives.csv";


    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_ADVERBS = new WordDefinitionCSVReader(false, ADVERBS_WITHOUT_ADJECTIVES_FILE_PATH).load();

    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_WORDS = new TreeMap<>();

    static {
        ALL_WORDS.putAll(ALL_ADVERBS);
    }

}
