package org.ml4j.language.verbs.english.conjugation.regular.en.gb;

import org.junit.jupiter.api.Test;
import org.ml4j.language.verbs.english.EnglishWordsEnGB;
import org.ml4j.language.verbs.english.conjugation.regular.base.RegularVerbConjugatorTestBase;

import java.util.Arrays;

public class AllRegularVerbsConjugatorTest extends RegularVerbConjugatorTestBase {

    @Test
    public void testRegularVerbConjugation() {
        testVerbConjugation(EnglishWordsEnGB.ALL_REGULAR_VERBS,
                Arrays.asList(EXPECTED_CONJUGATED_VERBS_STARTING_WITH_A_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_B_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_C_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_D_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_E_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_F_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_G_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_H_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_I_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_J_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_K_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_L_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_M_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_N_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_O_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_P_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_Q_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_R_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_S_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_T_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_U_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_V_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_W_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_X_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_Y_FILE_PATH,
                        EXPECTED_CONJUGATED_VERBS_STARTING_WITH_Z_FILE_PATH));
    }

}
