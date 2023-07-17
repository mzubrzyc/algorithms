package algorithms.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.RepeatedTest;

class RandomGeneratorTest {

    private final RandomGenerator randomGenerator = RandomGenerator.INSTANCE();

    @RepeatedTest(20)
    void drawForRange() {
        char a = 'a';
        assertThat(randomGenerator.drawForRange(a, a)).isEqualTo(97);
        int draw = randomGenerator.drawForRange(0, 2);
    }
}