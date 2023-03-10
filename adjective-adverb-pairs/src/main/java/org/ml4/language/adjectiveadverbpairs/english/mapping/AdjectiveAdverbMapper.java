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
package org.ml4.language.adjectiveadverbpairs.english.mapping;

import java.util.List;

/**
 * Default interface for a mapping between adjectives and adverbs within an adjective-adverb pair.
 *
 * @author Michael Lavelle
 */
public interface AdjectiveAdverbMapper {

    List<String> getAdverbsFromAdjective(String adjective);

    List<String> getAdjectivesFromAdverb(String adverb);


}
