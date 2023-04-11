package algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class AnagramCheckerTest {

    @Test
    void isAnagram() {
        prepareTestCases()
                .forEach(it -> {
                            log.info("isAnagram2: {}", it);
                            assertThat(AnagramChecker.isAnagram(it.word(), it.anagram())).isEqualTo(it.answer());
                        }
                );
    }


    @Test
    void isAnagram2() {
        prepareTestCases()
                .forEach(it -> {
                            log.info("isAnagram2: {}", it);
                            assertThat(AnagramChecker.isAnagram2(it.word(), it.anagram())).isEqualTo(it.answer());
                        }
                );
    }

    private List<AnagramAssertValues> prepareTestCases() {
        return List.of(
                new AnagramAssertValues("word", "wrdo", true),
                new AnagramAssertValues("mary", "army", true),
                new AnagramAssertValues("stop", "tops", true),
                new AnagramAssertValues("boat", "btoa", true),
                new AnagramAssertValues("pure", "in", false),
                new AnagramAssertValues("fill", "fil", false),
                new AnagramAssertValues("b", "bbb", false),
                new AnagramAssertValues("ccc", "ccccccc", false),
                new AnagramAssertValues("a", "a", true),
                new AnagramAssertValues("sleep", "slep", false),
                new AnagramAssertValues("sleep", "slepa", false)
        );
    }

}