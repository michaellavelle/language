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
package org.ml4j.language.words;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Default implementation of a Word Definition value object
 *
 * @author Michael Lavelle
 */
public class WordDefinition {
    private String word;
    private Optional<Boolean> stressOnLastSyllable;
    private List<String> components;

    public WordDefinition(String word, boolean stressOnLastSyllable, List<String> components) {
        this.word = word;
        this.stressOnLastSyllable = Optional.of(stressOnLastSyllable);
        this.components = components;
    }

    public WordDefinition(String word, boolean stressOnLastSyllable) {
        this.word = word;
        this.stressOnLastSyllable = Optional.of(stressOnLastSyllable);
        this.components = Arrays.asList(word);
    }

    public WordDefinition(String word) {
        this.word = word;
        this.stressOnLastSyllable = Optional.empty();
        this.components = Arrays.asList(word);
    }

    public String getWord() {
        return word;
    }

    public boolean isStressOnLastSyllable() {
        return stressOnLastSyllable.orElseThrow(() -> new IllegalStateException("Stress on last syllable not defined for:" + word));
    }

    public List<String> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "WordDefinition{" +
                "word='" + word + '\'' +
                ", stressOnLastSyllable=" + stressOnLastSyllable +
                ", components=" + components +
                '}';
    }
}
