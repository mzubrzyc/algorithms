package algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    @Test
    @DisplayName("Calc n'th element of fibonacci sequence")
    void findNthElement() {
        assertThat(Fibonacci.findNthElement(0)).isZero();
        assertThat(Fibonacci.findNthElement(1)).isEqualTo(1);
        assertThat(Fibonacci.findNthElement(2)).isEqualTo(1);
        assertThat(Fibonacci.findNthElement(3)).isEqualTo(2);
        assertThat(Fibonacci.findNthElement(4)).isEqualTo(3);
        assertThat(Fibonacci.findNthElement(5)).isEqualTo(5);
    }
}