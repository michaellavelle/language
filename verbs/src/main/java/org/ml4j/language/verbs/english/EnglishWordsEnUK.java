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
package org.ml4j.language.verbs.english;

import org.ml4j.language.core.util.CSVReader;
import org.ml4j.language.words.WordDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * Statically defined variables to hold the en_UK loaded collections of verbs, words etc in our vocab cache.
 *
 * @author Michael Lavelle
 */
public class EnglishWordsEnUK {

    private final static String VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_a.csv";
    private final static String VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_b.csv";
    private final static String VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_c.csv";
    private final static String VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_d.csv";
    private final static String VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_e.csv";
    private final static String VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_f.csv";
    private final static String VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_g.csv";
    private final static String VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_h.csv";
    private final static String VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_i.csv";
    private final static String VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_j.csv";
    private final static String VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_k.csv";
    private final static String VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_l.csv";
    private final static String VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_m.csv";
    private final static String VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_n.csv";
    private final static String VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_o.csv";
    private final static String VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_p.csv";
    private final static String VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_q.csv";
    private final static String VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_r.csv";
    private final static String VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_s.csv";
    private final static String VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_t.csv";
    private final static String VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_u.csv";
    private final static String VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_v.csv";
    private final static String VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_w.csv";
    private final static String VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_x.csv";
    private final static String VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_y.csv";
    private final static String VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH = "/english/regular/en_UK/regular_verbs_z.csv";

    private final static String MISC_WORDS_FILE_PATH = "/english/regular/en_UK/misc_words.csv";

    public final static List<WordDefinition> VERBS_STARTING_WITH_A = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_B = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_C = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_D = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_E = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_F = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_G = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_H = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_I = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_J = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_K = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_L = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_M = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_N = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_O = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_P = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_Q = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_R = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_S = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_T = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_U = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_V = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_W = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_X = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_Y = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH).load();
    public final static List<WordDefinition> VERBS_STARTING_WITH_Z = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH).load();

    public final static List<WordDefinition> MISC_WORDS = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false, MISC_WORDS_FILE_PATH).load();

    public final static List<WordDefinition> ALL_VERBS = new CSVReader<>(v -> new WordDefinition(v.get(0), Boolean.valueOf(v.get(1)), v.subList(2, v.size())), false,
            VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH,
            VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH
            ).load();

    public final static List<WordDefinition> ALL_WORDS = new ArrayList<>();

    static {
        ALL_WORDS.addAll(ALL_VERBS);
        ALL_WORDS.addAll(MISC_WORDS);
    }

}
