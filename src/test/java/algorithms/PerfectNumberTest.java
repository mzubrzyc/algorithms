package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PerfectNumberTest {

    @Test
    void isPerfect() {
        assertThat(PerfectNumber.isPerfect(28)).isTrue();
        assertThat(PerfectNumber.isPerfect(0)).isFalse();
        assertThat(PerfectNumber.isPerfect(496)).isTrue();
    }

    @Test
    void findInRange() {
        assertThat(PerfectNumber.findInRange(0, 10000))
                .containsExactly(
                        6,
                        28,
                        496,
                        8128
                );
    }
}