package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramCheckerTest {

    @Test
    void isAnagram() {
        assertThat(AnagramChecker.isAnagram("word", "wrdo")).isTrue();
        assertThat(AnagramChecker.isAnagram("mary", "army")).isTrue();
        assertThat(AnagramChecker.isAnagram("stop", "tops")).isTrue();
        assertThat(AnagramChecker.isAnagram("boat", "btoa")).isTrue();
        assertThat(AnagramChecker.isAnagram("pure", "in")).isFalse();
        assertThat(AnagramChecker.isAnagram("fill", "fil")).isFalse();
        assertThat(AnagramChecker.isAnagram("b", "bbb")).isFalse();
        assertThat(AnagramChecker.isAnagram("ccc", "ccccccc")).isFalse();
        assertThat(AnagramChecker.isAnagram("a", "a")).isTrue();
        assertThat(AnagramChecker.isAnagram("sleep", "slep")).isFalse();
    }


}