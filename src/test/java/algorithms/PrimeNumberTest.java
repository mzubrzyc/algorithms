package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {

    @Test
    void isPrimeNumber() {
        assertThat(PrimeNumber.isPrimeNumber(633_910_099)).isTrue();
    }
}