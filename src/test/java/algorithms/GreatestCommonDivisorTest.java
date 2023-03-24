package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreatestCommonDivisorTest {

    @Test
    void calculate() {
        assertThat(GreatestCommonDivisor.calculate(12, 30)).isEqualTo(6);
        assertThat(GreatestCommonDivisor.calculate(12, -30)).isEqualTo(-1);

    }

    @Test
    void calculateEuclidAlgorithm() {
        assertThat(GreatestCommonDivisor.calculateEuclidAlgorithm(12, 30)).isEqualTo(6);
        assertThat(GreatestCommonDivisor.calculateEuclidAlgorithm(12, -30)).isEqualTo(-1);
        assertThat(GreatestCommonDivisor.calculateEuclidAlgorithm(4, 16)).isEqualTo(4);
        assertThat(GreatestCommonDivisor.calculateEuclidAlgorithm(16, 4)).isEqualTo(4);

    }
}