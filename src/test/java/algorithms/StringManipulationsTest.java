package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringManipulationsTest {

    @Test
    void reverseStringRecursiveMethod() {
        String toBeReversed = "Ala ma kota.";
        assertThat(StringManipulations.reverseStringRecursiveMethod(toBeReversed))
                .isEqualTo(new StringBuilder(toBeReversed).reverse().toString());
    }

    @Test
    void reverseStringIterativeMethod() {
        String toBeReversed = "Ala ma kota.";
        assertThat(StringManipulations.reverseStringIterativeMethod(toBeReversed))
                .isEqualTo(new StringBuilder(toBeReversed).reverse().toString());
    }

}