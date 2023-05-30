package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromCheckerTest {

    @Test
    void isPalindrome() {
        assertThat(PalindromChecker.isPalindromeCaseInsensitive("Radar")).isTrue();
        assertThat(PalindromChecker.isPalindromeCaseInsensitive("1001001")).isTrue();
    }

    @Test
    void testIsPalindrome() {
        assertThat(PalindromChecker.isPalindrome(101)).isTrue();
        assertThat(PalindromChecker.isPalindrome(0)).isTrue();
        assertThat(PalindromChecker.isPalindrome(-101)).isTrue();
    }

    @Test
    void isPalindromeIterationCheck() {
        assertThat(PalindromChecker.isPalindromeIterativeCheckCaseSensitive("Radar")).isFalse();
        assertThat(PalindromChecker.isPalindromeIterativeCheckCaseSensitive("radar")).isTrue();
        assertThat(PalindromChecker.isPalindromeIterativeCheckCaseSensitive("1001001")).isTrue();
    }
}