package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class AnagramCheckerTest {

    @Test
    void isAnagram() {
        prepareTestCases()
            .forEach(it -> assertThat(AnagramChecker.isAnagramByIteration(it.word(), it.anagram())).isEqualTo(it.answer())
            );
    }

    @Test
    void isAnagram2() {
        prepareTestCases()
            .forEach(it -> assertThat(AnagramChecker.isAnagramBySort(it.word(), it.anagram())).isEqualTo(it.answer())
            );
    }

    private List<AnagramAssertionValues> prepareTestCases() {
        return List.of(
            new AnagramAssertionValues("word", "wrdo", true),
            new AnagramAssertionValues("mary", "army", true),
            new AnagramAssertionValues("stop", "tops", true),
            new AnagramAssertionValues("boat", "btoa", true),
            new AnagramAssertionValues("pure", "in", false),
            new AnagramAssertionValues("fill", "fil", false),
            new AnagramAssertionValues("b", "bbb", false),
            new AnagramAssertionValues("ccc", "ccccccc", false),
            new AnagramAssertionValues("a", "a", true),
            new AnagramAssertionValues("sleep", "slep", false),
            new AnagramAssertionValues("sleep", "slepa", false)
        );
    }

    record AnagramAssertionValues(
        String word,
        String anagram,
        boolean answer
    ) {}

}