package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void calculateRecursively() {
        assertThat(Factorial.calculateRecursively(0)).isOne();
        assertThat(Factorial.calculateRecursively(1)).isEqualTo(1L);
        assertThat(Factorial.calculateRecursively(2)).isEqualTo(2L);
        assertThat(Factorial.calculateRecursively(20)).isEqualTo(2432902008176640000L);
    }

    @Test
    void factorialUsingApacheCommons() {
        assertThat(Factorial.usingApacheCommons(0)).isOne();
        assertThat(Factorial.usingApacheCommons(1)).isEqualTo(1L);
        assertThat(Factorial.usingApacheCommons(2)).isEqualTo(2L);
        assertThat(Factorial.usingApacheCommons(20)).isEqualTo(2432902008176640000L);
    }
}