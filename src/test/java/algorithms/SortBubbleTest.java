package algorithms;

import fixture.NumberGenerationFixture;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortBubbleTest {

    @Test
    void bubbleSort() {
        List<Integer> integers = NumberGenerationFixture.generateListOfRandomIntNumbers(10);
        List<Integer> sortedIntegers = SortBubble.bubbleSort(integers);
        assertThat(sortedIntegers).isNotEmpty();



    }
}