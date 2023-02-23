package org.ml4j.language.adjectiveadverbpairs.english.mapping.impl.base;

import org.junit.jupiter.api.Assertions;
import org.ml4.language.adjectiveadverbpairs.english.EnglishAdjectiveAdverbPairsEnGB;
import org.ml4.language.adjectiveadverbpairs.english.mapping.AdjectiveAdverbMapper;
import org.ml4.language.adjectiveadverbpairs.english.mapping.impl.EnGBAdjectiveAdverbMapper;
import org.ml4j.language.adjectiveadverbpairs.mapping.util.AdjectiveAdverbPair;
import org.ml4j.language.adjectiveadverbpairs.mapping.util.AdjectiveAdverbPairCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.*;
import java.util.stream.Collectors;

public class AdjectiveAdverbMapperTestBase {

    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_A_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_a_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_B_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_b_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_C_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_c_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_D_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_d_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_E_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_e_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_F_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_f_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_G_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_g_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_H_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_h_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_I_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_i_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_J_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_j_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_K_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_k_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_L_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_l_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_M_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_m_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_N_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_n_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_O_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_o_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_P_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_p_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_Q_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_q_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_R_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_r_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_S_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_s_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_T_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_t_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_U_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_u_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_V_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_v_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_W_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_w_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_X_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_x_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_Y_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_y_mappings.csv";
    protected final static String EXPECTED_ADJECTIVE_ADVERB_PAIRS_STARTING_WITH_Z_FILE_PATH = "/english/adjective-adverb-pairs/en-GB/adjective_adverb_pairs_z_mappings.csv";

    protected void testAdjectiveAdverbMapping(SortedMap<WordDefinitionId, WordDefinition> adjectivesStartingWithA, SortedMap<WordDefinitionId, WordDefinition> adverbsStartingWithA, String expectedResultsFilePath) {

        List<String> adjectives = new ArrayList<>();
        for (WordDefinitionId a : adjectivesStartingWithA.keySet()) {
            adjectives.add(a.getWord());
        }
        List<String> adverbs = new ArrayList<>();
        for (WordDefinitionId a : adverbsStartingWithA.keySet()) {
            adverbs.add(a.getWord());
        }
        int adjectivesSize = adjectives.size();
        Assertions.assertEquals(adjectivesSize, adverbs.size());
        adjectives = adjectives.stream().distinct().collect(Collectors.toList());
        adverbs = adverbs.stream().distinct().collect(Collectors.toList());
        int distinctAdjectivesSize = adjectives.size();
        Assertions.assertEquals(adjectivesSize, distinctAdjectivesSize, "Distinct adjectives list size is different from adjectives list size");
        Assertions.assertEquals(distinctAdjectivesSize, adverbs.size(), "Distinct adjectives size is different from distinct adverbs size");

        AdjectiveAdverbMapper adverbMapper = new EnGBAdjectiveAdverbMapper();

        SortedMap<WordDefinitionId, AdjectiveAdverbPair> expectedMappings =
                new AdjectiveAdverbPairCSVReader((i, v) ->
                        new AdjectiveAdverbPair(v.get(0), i.getMeaningId(), v.get(1)),
                        false, Arrays.asList(expectedResultsFilePath)).load();

        Assertions.assertEquals(adjectivesSize, expectedMappings.size(), "Size of expected mappings doesn't match adjectives size");

        for (Map.Entry<WordDefinitionId, AdjectiveAdverbPair> entry : expectedMappings.entrySet()) {
            Assertions.assertEquals(entry.getKey().getWord(), entry.getValue().getAdjective());
            Assertions.assertTrue(adjectives.contains(entry.getValue().getAdjective()), "Registered adjective list doesn't contain expected adjective of:" + entry.getValue().getAdjective());
            Assertions.assertTrue(adverbs.contains(entry.getValue().getAdverb()), "Registered adverb list doesn't contain expected adverb of:" + entry.getValue().getAdverb());
            String mappedAdverb = adverbMapper.getAdverbFromAdjective(entry.getKey().getWord());
            Assertions.assertEquals(entry.getValue().getAdverb(), mappedAdverb, "Mapped adverb doesn't match expected adverb of:" + entry.getValue().getAdverb());
        }
    }
}
