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

    @Test
    void isPalindrome() {
        assertThat(StringManipulations.isPalindrome("Radar")).isTrue();
        assertThat(StringManipulations.isPalindrome("1001001")).isTrue();
    }

    @Test
    void isAnagram() {
        Assertions.assertThat(StringManipulations.isAnagram("word", "wrdo")).isTrue();
        Assertions.assertThat(StringManipulations.isAnagram("mary", "army")).isTrue();
        Assertions.assertThat(StringManipulations.isAnagram("stop", "tops")).isTrue();
        Assertions.assertThat(StringManipulations.isAnagram("boat", "btoa")).isTrue();
        Assertions.assertThat(StringManipulations.isAnagram("pure", "in")).isFalse();
        Assertions.assertThat(StringManipulations.isAnagram("fill", "fil")).isFalse();
        Assertions.assertThat(StringManipulations.isAnagram("b", "bbb")).isFalse();
        Assertions.assertThat(StringManipulations.isAnagram("ccc", "ccccccc")).isFalse();
        Assertions.assertThat(StringManipulations.isAnagram("a", "a")).isTrue();
        Assertions.assertThat(StringManipulations.isAnagram("sleep", "slep")).isFalse();
    }
}