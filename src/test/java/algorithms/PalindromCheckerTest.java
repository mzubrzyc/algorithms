package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromCheckerTest {

    @Test
    void isPalindrome() {
        assertThat(PalindromChecker.isPalindrome("Radar")).isTrue();
        assertThat(PalindromChecker.isPalindrome("1001001")).isTrue();
    }

    @Test
    void testIsPalindrome() {
        assertThat(PalindromChecker.isPalindrome(101)).isTrue();
        assertThat(PalindromChecker.isPalindrome(0)).isTrue();
        assertThat(PalindromChecker.isPalindrome(-101)).isTrue();
    }
}