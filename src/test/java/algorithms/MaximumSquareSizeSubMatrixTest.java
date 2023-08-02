package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaximumSquareSizeSubMatrixTest {

    @Test
    void sumMaximumSubMatrix() {

        int[][] inputMatrix =
            {
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
            };
        assertThat(MaximumSquareSizeSubMatrix.sumMaximumSubMatrix(inputMatrix)).isEqualTo(9);

    }
}