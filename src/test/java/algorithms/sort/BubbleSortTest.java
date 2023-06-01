package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import fixture.NumberGenerationFixture;
import java.util.List;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        List<Integer> integers = NumberGenerationFixture.generateListOfRandomIntNumbers(10);
        List<Integer> sortedIntegers = BubbleSort.bubbleSort(integers);
        assertThat(sortedIntegers).isNotEmpty();
    }

}