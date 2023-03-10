package org.ml4j.language.verbs.english.conjugation.regular.base;

import org.ml4j.language.verbs.english.conjugation.VerbConjugators;
import org.ml4j.language.verbs.english.conjugation.base.VerbConjugatorTestBase;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugation;
import org.ml4j.language.verbs.english.conjugation.regular.RegularVerbConjugator;
import org.ml4j.language.verbs.english.conjugation.util.VerbConjugationCSVReader;
import org.ml4j.language.words.WordDefinition;
import org.ml4j.language.words.WordDefinitionId;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class RegularVerbConjugatorTestBase extends VerbConjugatorTestBase {

    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_A_FILE_PATH = "/english/regular/en-GB/regular_verbs_a_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_B_FILE_PATH = "/english/regular/en-GB/regular_verbs_b_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_C_FILE_PATH = "/english/regular/en-GB/regular_verbs_c_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_D_FILE_PATH = "/english/regular/en-GB/regular_verbs_d_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_E_FILE_PATH = "/english/regular/en-GB/regular_verbs_e_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_F_FILE_PATH = "/english/regular/en-GB/regular_verbs_f_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_G_FILE_PATH = "/english/regular/en-GB/regular_verbs_g_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_H_FILE_PATH = "/english/regular/en-GB/regular_verbs_h_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_I_FILE_PATH = "/english/regular/en-GB/regular_verbs_i_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_J_FILE_PATH = "/english/regular/en-GB/regular_verbs_j_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_K_FILE_PATH = "/english/regular/en-GB/regular_verbs_k_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_L_FILE_PATH = "/english/regular/en-GB/regular_verbs_l_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_M_FILE_PATH = "/english/regular/en-GB/regular_verbs_m_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_N_FILE_PATH = "/english/regular/en-GB/regular_verbs_n_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_O_FILE_PATH = "/english/regular/en-GB/regular_verbs_o_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_P_FILE_PATH = "/english/regular/en-GB/regular_verbs_p_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_Q_FILE_PATH = "/english/regular/en-GB/regular_verbs_q_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_R_FILE_PATH = "/english/regular/en-GB/regular_verbs_r_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_S_FILE_PATH = "/english/regular/en-GB/regular_verbs_s_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_T_FILE_PATH = "/english/regular/en-GB/regular_verbs_t_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_U_FILE_PATH = "/english/regular/en-GB/regular_verbs_u_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_V_FILE_PATH = "/english/regular/en-GB/regular_verbs_v_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_W_FILE_PATH = "/english/regular/en-GB/regular_verbs_w_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_X_FILE_PATH = "/english/regular/en-GB/regular_verbs_x_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_Y_FILE_PATH = "/english/regular/en-GB/regular_verbs_y_conjugations.csv";
    protected final static String EXPECTED_CONJUGATED_VERBS_STARTING_WITH_Z_FILE_PATH = "/english/regular/en-GB/regular_verbs_z_conjugations.csv";

    protected void testVerbConjugation(SortedMap<WordDefinitionId, WordDefinition> verbs, String expectedResultsFilePaths) {
        testVerbConjugation(verbs, Arrays.asList(expectedResultsFilePaths));
    }


        protected void testVerbConjugation(SortedMap<WordDefinitionId, WordDefinition> verbs, List<String> expectedResultsFilePaths) {

        RegularVerbConjugator regularVerbConjugator = VerbConjugators.REGULAR_VERB_CONJUGATOR;

        SortedMap<WordDefinitionId, RegularVerbConjugation> expectedConjugatedVerbs =
                new VerbConjugationCSVReader<>((i, v) ->
                        new RegularVerbConjugation(v.get(0), i.getMeaningId(), getValuesFromVariables(v, "past_tense", false), getValuesFromVariables(v, "present_participle", true)),
                        false, expectedResultsFilePaths).load();

        testVerbConjugation(regularVerbConjugator, expectedConjugatedVerbs, verbs);
    }
}
