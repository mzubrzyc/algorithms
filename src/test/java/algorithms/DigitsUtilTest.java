package algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DigitsUtilTest {

    @Test
    @DisplayName("Digits should be added correctly")
    void numberOfDigitsRecursive() {
        // given
        List<Integer> inputNumbers = List.of(123, 351, 1, 0, 10);
        List<Integer> answers = List.of(6, 9, 1, 0, 1);
        // expect:
        for (int i = 0; i < inputNumbers.size(); i++) {
            assertThat(DigitsUtil.numberOfDigitsRecursive(inputNumbers.get(i))).isEqualTo(answers.get(i));
        }
    }

    @Test
    void numberOfDigitsMultiplication() {
        // given
        List<Integer> inputNumbers = List.of(0, 1, 9, 99, 101, 351, 19999);
        List<Integer> answers = List.of(0, 1, 1, 2, 3, 3, 5);
        // expect:
        for (int i = 0; i < inputNumbers.size(); i++) {
            assertThat(DigitsUtil.numberOfDigitsMultiplication(inputNumbers.get(i))).isEqualTo(answers.get(i));
        }
    }

    @Test
    void numberOfDigitsDigitsDividingWithPowersOfTwo() {
        // given
        List<Integer> inputNumbers = List.of(0, 9, 99, 101, 351, 19999);
        List<Integer> answers = List.of(0, 1, 2, 3, 3, 5);
        // expect:
        for (int i = 0; i < inputNumbers.size(); i++) {
            assertThat(DigitsUtil.numberOfDigitsDigitsDividingWithPowersOfTwo(inputNumbers.get(i))).isEqualTo(answers.get(i));
        }
    }
}