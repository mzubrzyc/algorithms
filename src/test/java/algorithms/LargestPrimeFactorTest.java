package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LargestPrimeFactorTest {

    @Test
    void find() {
        assertThat(LargestPrimeFactor.find(0)).isEqualTo(-1L);
        assertThat(LargestPrimeFactor.find(2L)).isEqualTo(2L);
        assertThat(LargestPrimeFactor.find(25698751364526L)).isEqualTo(328513L);
    }

    @Test
    void find2() {
        assertThat(LargestPrimeFactor.find2(25698751364526L)).isEqualTo(328513L);
    }
}