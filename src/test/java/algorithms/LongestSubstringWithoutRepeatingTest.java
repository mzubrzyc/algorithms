package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingTest {

    @Test
    void calculate() {
        assertThat(LongestSubstringWithoutRepeating.calculate("abcbc")).isEqualTo(3);
        assertThat(LongestSubstringWithoutRepeating.calculate("abcbbbbcadd")).isEqualTo(4);
    }

}