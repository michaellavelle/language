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

import org.ml4j.language.core.util.WordDefinitionCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Statically defined variables to hold the en-GB loaded collections of verbs, words etc in our vocab cache.
 *
 * @author Michael Lavelle
 */
public class EnglishWordsEnGB {

    private final static String REGULAR_VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_a.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_b.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_c.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_d.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_e.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_f.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_g.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_h.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_i.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_j.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_k.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_l.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_m.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_n.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_o.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_p.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_q.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_r.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_s.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_t.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_u.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_v.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_w.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_x.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_y.csv";
    private final static String REGULAR_VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH = "/english/regular/en-GB/regular_verbs_z.csv";

    private final static String IRREGULAR_VERBS_TYPE_1_DEFINITION_FILE_PATH = "/english/irregular/en-GB/irregular_verbs_type_1.csv";
    private final static String IRREGULAR_VERBS_TYPE_2_DEFINITION_FILE_PATH = "/english/irregular/en-GB/irregular_verbs_type_2.csv";
    private final static String IRREGULAR_VERBS_TYPE_3_DEFINITION_FILE_PATH = "/english/irregular/en-GB/irregular_verbs_type_3.csv";
    private final static String IRREGULAR_VERBS_TYPE_4_DEFINITION_FILE_PATH = "/english/irregular/en-GB/irregular_verbs_type_4.csv";

    private final static String MISC_WORDS_FILE_PATH = "/english/regular/en-GB/misc_words.csv";

    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_A = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_B = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_C = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_D = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_E = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_F = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_G = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_H = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_I = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_J = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_K = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_L = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_M = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_N = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_O = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_P = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_Q = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_R = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_S = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_T = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_U = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_V = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_W = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_X = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_Y = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> REGULAR_VERBS_STARTING_WITH_Z = new WordDefinitionCSVReader(false, REGULAR_VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH).load();

    public final static SortedMap<WordDefinitionId, WordDefinition> IRREGULAR_VERBS_TYPE_1 = new WordDefinitionCSVReader(false, IRREGULAR_VERBS_TYPE_1_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> IRREGULAR_VERBS_TYPE_2 = new WordDefinitionCSVReader(false, IRREGULAR_VERBS_TYPE_2_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> IRREGULAR_VERBS_TYPE_3 = new WordDefinitionCSVReader(false, IRREGULAR_VERBS_TYPE_3_DEFINITION_FILE_PATH).load();

    public final static SortedMap<WordDefinitionId, WordDefinition> MISC_WORDS = new WordDefinitionCSVReader(false, MISC_WORDS_FILE_PATH).load();

    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_REGULAR_VERBS = new WordDefinitionCSVReader(false,
            REGULAR_VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH).load();


    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_VERBS = new WordDefinitionCSVReader(false,
            REGULAR_VERBS_STARTING_WITH_A_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_B_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_C_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_D_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_E_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_F_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_G_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_H_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_I_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_J_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_K_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_L_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_M_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_N_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_O_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_P_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_R_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_S_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_T_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_U_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_V_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_W_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_X_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH,
            REGULAR_VERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_1_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_2_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_3_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_4_DEFINITION_FILE_PATH
    ).load();


    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_IRREGULAR_VERBS = new WordDefinitionCSVReader(false,
            IRREGULAR_VERBS_TYPE_1_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_2_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_3_DEFINITION_FILE_PATH,
            IRREGULAR_VERBS_TYPE_4_DEFINITION_FILE_PATH

    ).load();


    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_WORDS = new TreeMap<>();

    static {
        ALL_WORDS.putAll(ALL_VERBS);
        ALL_WORDS.putAll(MISC_WORDS);
    }

}
