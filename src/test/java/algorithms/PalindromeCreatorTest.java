package algorithms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import algorithms.utils.RandomGenerator;
import java.util.List;
import org.junit.jupiter.api.Test;

class PalindromeCreatorTest {

    RandomGenerator randomGenerator = mock(RandomGenerator.class);

    @Test
    void createFor_even_number_of_letters() {
        // given
        final int MIN_LETTER = 97;
        final int MAX_LETTER = 122;
        int numberOfLetters = 8;
        int numberOfUniqueLetters = 3;
        List<Character> uniqueChars = List.of('a', 'b', 'c');
        given(randomGenerator.generateRandomUniqueLetters(numberOfUniqueLetters, MIN_LETTER, MAX_LETTER))
            .willReturn(uniqueChars);
        given(randomGenerator.drawForRange(anyInt(), anyInt()))
            .willReturn(1, 2, 1, 1, 1, 0);
        PalindromeCreator palindromeCreator = new PalindromeCreator(randomGenerator);
        // when
        String generatedPalindrome = palindromeCreator.createFor(numberOfLetters, numberOfUniqueLetters, MIN_LETTER, MAX_LETTER);
        // then
        assertThat(generatedPalindrome).hasSize(numberOfLetters);
        assertThat(generatedPalindrome).isEqualTo("bcbaabcb");
    }

    @Test
    void createFor_odd_number_of_letters() {
        // given
        final int MIN_LETTER = 97;
        final int MAX_LETTER = 122;
        int numberOfLetters = 5;
        int numberOfUniqueLetters = 7;
        int maxProperNumberOfUniqueLetters = 3;
        List<Character> uniqueChars = List.of('a', 'b', 'c');
        given(randomGenerator.generateRandomUniqueLetters(maxProperNumberOfUniqueLetters, MIN_LETTER, MAX_LETTER))
            .willReturn(uniqueChars);
        given(randomGenerator.drawForRange(anyInt(), anyInt()))
            .willReturn(1, 2, 1, 1, 1, 0);
        PalindromeCreator palindromeCreator = new PalindromeCreator(randomGenerator);
        // when
        String generatedPalindrome = palindromeCreator.createFor(numberOfLetters, numberOfUniqueLetters, MIN_LETTER, MAX_LETTER);
        // then
        assertThat(generatedPalindrome).hasSize(numberOfLetters);
        assertThat(generatedPalindrome).isEqualTo("bcacb");
    }
}