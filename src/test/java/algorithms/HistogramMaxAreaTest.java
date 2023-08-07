package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HistogramMaxAreaTest {

    @Test
    void calc() {
        int[] inputArray = new int[] {4, 2, 1, 5, 6, 3, 2, 4, 2};
        Assertions.assertThat(HistogramMaxArea.calc(inputArray)).isEqualTo(12);
    }
}