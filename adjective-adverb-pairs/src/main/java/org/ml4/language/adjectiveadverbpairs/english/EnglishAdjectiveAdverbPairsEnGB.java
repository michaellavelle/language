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
package org.ml4.language.adjectiveadverbpairs.english;

import org.ml4j.language.core.util.WordDefinitionCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Statically defined variables to hold the en-GB loaded collections of adjectives, adverbs, words etc in our vocab cache.
 *
 * @author Michael Lavelle
 */
public class EnglishAdjectiveAdverbPairsEnGB {

    private final static String ADJECTIVES_STARTING_WITH_A_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_a.csv";
    private final static String ADJECTIVES_STARTING_WITH_B_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_b.csv";
    private final static String ADJECTIVES_STARTING_WITH_C_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_c.csv";
    private final static String ADJECTIVES_STARTING_WITH_D_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_d.csv";
    private final static String ADJECTIVES_STARTING_WITH_E_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_e.csv";
    private final static String ADJECTIVES_STARTING_WITH_F_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_f.csv";
    private final static String ADJECTIVES_STARTING_WITH_G_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_g.csv";
    private final static String ADJECTIVES_STARTING_WITH_H_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_h.csv";
    private final static String ADJECTIVES_STARTING_WITH_I_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_i.csv";
    private final static String ADJECTIVES_STARTING_WITH_J_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_j.csv";
    private final static String ADJECTIVES_STARTING_WITH_K_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_k.csv";
    private final static String ADJECTIVES_STARTING_WITH_L_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_l.csv";
    private final static String ADJECTIVES_STARTING_WITH_M_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_m.csv";
    private final static String ADJECTIVES_STARTING_WITH_N_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_n.csv";
    private final static String ADJECTIVES_STARTING_WITH_O_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_o.csv";
    private final static String ADJECTIVES_STARTING_WITH_P_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_p.csv";
    private final static String ADJECTIVES_STARTING_WITH_Q_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_q.csv";
    private final static String ADJECTIVES_STARTING_WITH_R_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_r.csv";
    private final static String ADJECTIVES_STARTING_WITH_S_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_s.csv";
    private final static String ADJECTIVES_STARTING_WITH_T_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_t.csv";
    private final static String ADJECTIVES_STARTING_WITH_U_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_u.csv";
    private final static String ADJECTIVES_STARTING_WITH_V_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_v.csv";
    private final static String ADJECTIVES_STARTING_WITH_W_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_w.csv";
    private final static String ADJECTIVES_STARTING_WITH_X_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_x.csv";
    private final static String ADJECTIVES_STARTING_WITH_Y_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_y.csv";
    private final static String ADJECTIVES_STARTING_WITH_Z_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adjectives/en-GB/adjectives_z.csv";

    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_A = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_A_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_B = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_B_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_C = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_C_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_D = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_D_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_E = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_E_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_F = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_F_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_G = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_G_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_H = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_H_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_I = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_I_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_J = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_J_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_K = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_K_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_L = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_L_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_M = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_M_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_N = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_N_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_O = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_O_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_P = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_P_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_Q = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_Q_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_R = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_R_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_S = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_S_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_T = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_T_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_U = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_U_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_V = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_V_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_W = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_W_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_X = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_X_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_Y = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_Y_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADJECTIVES_STARTING_WITH_Z = new WordDefinitionCSVReader(false, ADJECTIVES_STARTING_WITH_Z_DEFINITION_FILE_PATH).load();

    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_ADJECTIVES = new WordDefinitionCSVReader(false,
            ADJECTIVES_STARTING_WITH_A_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_B_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_C_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_D_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_E_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_F_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_G_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_H_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_I_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_J_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_K_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_L_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_M_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_N_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_O_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_P_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_Q_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_R_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_S_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_T_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_U_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_V_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_W_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_X_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_Y_DEFINITION_FILE_PATH,
            ADJECTIVES_STARTING_WITH_Z_DEFINITION_FILE_PATH
    ).load();

    private final static String ADVERBS_STARTING_WITH_A_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_a.csv";
    private final static String ADVERBS_STARTING_WITH_B_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_b.csv";
    private final static String ADVERBS_STARTING_WITH_C_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_c.csv";
    private final static String ADVERBS_STARTING_WITH_D_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_d.csv";
    private final static String ADVERBS_STARTING_WITH_E_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_e.csv";
    private final static String ADVERBS_STARTING_WITH_F_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_f.csv";
    private final static String ADVERBS_STARTING_WITH_G_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_g.csv";
    private final static String ADVERBS_STARTING_WITH_H_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_h.csv";
    private final static String ADVERBS_STARTING_WITH_I_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_i.csv";
    private final static String ADVERBS_STARTING_WITH_J_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_j.csv";
    private final static String ADVERBS_STARTING_WITH_K_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_k.csv";
    private final static String ADVERBS_STARTING_WITH_L_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_l.csv";
    private final static String ADVERBS_STARTING_WITH_M_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_m.csv";
    private final static String ADVERBS_STARTING_WITH_N_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_n.csv";
    private final static String ADVERBS_STARTING_WITH_O_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_o.csv";
    private final static String ADVERBS_STARTING_WITH_P_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_p.csv";
    private final static String ADVERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_q.csv";
    private final static String ADVERBS_STARTING_WITH_R_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_r.csv";
    private final static String ADVERBS_STARTING_WITH_S_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_s.csv";
    private final static String ADVERBS_STARTING_WITH_T_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_t.csv";
    private final static String ADVERBS_STARTING_WITH_U_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_u.csv";
    private final static String ADVERBS_STARTING_WITH_V_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_v.csv";
    private final static String ADVERBS_STARTING_WITH_W_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_w.csv";
    private final static String ADVERBS_STARTING_WITH_X_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_x.csv";
    private final static String ADVERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_y.csv";
    private final static String ADVERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH = "/english/adjective-adverb-pairs/adverbs/en-GB/adverbs_z.csv";


    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_A = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_A_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_B = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_B_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_C = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_C_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_D = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_D_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_E = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_E_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_F = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_F_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_G = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_G_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_H = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_H_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_I = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_I_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_J = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_J_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_K = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_K_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_L = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_L_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_M = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_M_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_N = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_N_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_O = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_O_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_P = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_P_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_Q = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_R = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_R_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_S = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_S_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_T = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_T_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_U = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_U_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_V = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_V_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_W = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_W_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_X = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_X_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_Y = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH).load();
    public final static SortedMap<WordDefinitionId, WordDefinition> ADVERBS_STARTING_WITH_Z = new WordDefinitionCSVReader(false, ADVERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH).load();


    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_ADVERBS = new WordDefinitionCSVReader(false,
            ADVERBS_STARTING_WITH_A_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_B_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_C_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_D_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_E_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_F_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_G_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_H_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_I_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_J_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_K_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_L_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_M_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_N_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_O_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_P_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_Q_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_R_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_S_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_T_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_U_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_V_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_W_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_X_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_Y_DEFINITION_FILE_PATH,
            ADVERBS_STARTING_WITH_Z_DEFINITION_FILE_PATH
    ).load();

    public final static SortedMap<WordDefinitionId, WordDefinition> ALL_WORDS = new TreeMap<>();

    static {
        ALL_WORDS.putAll(ALL_ADJECTIVES);
        ALL_WORDS.putAll(ALL_ADVERBS);
    }

}
