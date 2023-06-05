package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import fixture.ArrayUtil;
import fixture.NumberGenerationFixture;
import java.util.List;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private final BubbleSort bubbleSort = BubbleSort.getInstance();

    @Test
    void bubbleSort() {
        List<Integer> integers = NumberGenerationFixture.generateListOfRandomIntNumbers(10);
        int[] sortedIntegers = bubbleSort.accept(ArrayUtil.fromListOfIntegers(integers));
        assertThat(sortedIntegers).isNotEmpty();
        int[] ints = new int[] {1, 12, 9, 5, 6, 10};
        int[] expected = new int[] {1, 5, 6, 9, 10, 12};
        assertThat(bubbleSort.accept(ints)).containsExactly(expected);
        ints = new int[] {9, 9, 8, 8, 3, 2, 2, 3, 2, 1};
        expected = new int[] {1, 2, 2, 2, 3, 3, 8, 8, 9, 9};
        assertThat(bubbleSort.accept(ints)).containsExactly(expected);
    }

}