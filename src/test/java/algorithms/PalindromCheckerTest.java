package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromCheckerTest {

    @Test
    void isAnagram() {
        assertThat(PalindromChecker.isAnagram("word", "wrdo")).isTrue();
        assertThat(PalindromChecker.isAnagram("mary", "army")).isTrue();
        assertThat(PalindromChecker.isAnagram("stop", "tops")).isTrue();
        assertThat(PalindromChecker.isAnagram("boat", "btoa")).isTrue();
        assertThat(PalindromChecker.isAnagram("pure", "in")).isFalse();
        assertThat(PalindromChecker.isAnagram("fill", "fil")).isFalse();
        assertThat(PalindromChecker.isAnagram("b", "bbb")).isFalse();
        assertThat(PalindromChecker.isAnagram("ccc", "ccccccc")).isFalse();
        assertThat(PalindromChecker.isAnagram("a", "a")).isTrue();
        assertThat(PalindromChecker.isAnagram("sleep", "slep")).isFalse();

    }

    @Test
    void isPalindrome() {
        assertThat(PalindromChecker.isPalindrome("Radar")).isTrue();
        assertThat(PalindromChecker.isPalindrome("1001001")).isTrue();
    }


}