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
package org.ml4j.language.core.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;

/**
 * Default implementation of a CSV Reader
 *
 * @author Michael Lavelle
 */
public class CSVReader<T> {

    private Function<List<String>, T> mappingFunction;
    private boolean firstLineAsHeader;
    private List<String> fileResources;

    public CSVReader(Function<List<String>, T> mappingFunction, boolean firstLineAsHeader, String primaryFileResource, String... additionalFileResources) {
        this.mappingFunction = mappingFunction;
        this.firstLineAsHeader = firstLineAsHeader;
        this.fileResources = new ArrayList<>();
        this.fileResources.add(primaryFileResource);
        if (firstLineAsHeader) {
            throw new UnsupportedOperationException("First line as header configuration not yet implemented");
        }
        this.fileResources.addAll(Arrays.asList(additionalFileResources));
    }

    public List<T> load() {
        List<T> results = new ArrayList<>();
        for (String resource : fileResources) {
            try (InputStream is = CSVReader.class.getResourceAsStream(resource)) {
                try (BufferedInputStream bis = new BufferedInputStream(is)) {
                    String content = new String(bis.readAllBytes());
                    StringTokenizer st = new StringTokenizer(content, "\n");
                    while (st.hasMoreTokens()) {
                        String line = st.nextToken().trim();
                        results.add(getMappedLine(line));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return results;
    }

    private T getMappedLine(String line) {
        StringTokenizer st = new StringTokenizer(line, ",");
        List<String> variables = new ArrayList<>();
        while (st.hasMoreTokens()) {
            variables.add(st.nextToken());
        }
        return mappingFunction.apply(variables);
    }
}
