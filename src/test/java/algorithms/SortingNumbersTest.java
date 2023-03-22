package algorithms;

import fixture.NumberGenerationFixture;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortingNumbersTest {

    @Test
    void bubbleSort() {
        List<Integer> integers = NumberGenerationFixture.generateArrayOfRandomIntNumbers(10);
        List<Integer> sortedIntegers = SortingNumbers.bubbleSort(integers);
        assertThat(sortedIntegers).isNotEmpty();



    }
}