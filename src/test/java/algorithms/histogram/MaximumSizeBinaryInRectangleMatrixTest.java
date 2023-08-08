package algorithms.histogram;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaximumSizeBinaryInRectangleMatrixTest {

    @Test
    void find() {
        int[][] inputArray = new int[][] {
            {1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1}
        };
        assertThat(MaximumSizeBinaryInRectangleMatrix.find(inputArray)).isEqualTo(15);
    }
}