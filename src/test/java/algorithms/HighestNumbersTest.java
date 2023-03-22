package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HighestNumbersTest {

    @Test
    void returnTopTwoHighestNumbers() {
        List<Integer> numbers = List.of(1, 10, 3, 5, 1, 9, 4, 6);
        Assertions.assertThat(HighestNumbers.returnTopTwoHighestNumbers(numbers)).containsExactly(10, 9);

    }
}