package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import fixture.ArrayUtil;
import fixture.NumberGenerationFixture;
import java.util.List;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    private final SortAlgorithm quickSort = QuickSort.getInstance();

    @Test
    void run() {
        List<Integer> integers = NumberGenerationFixture.generateListOfRandomIntNumbers(10, 10);
        int[] array = ArrayUtil.fromListOfIntegers(integers);
        int[] expected = ArrayUtil.fromListOfIntegers(
            integers.stream()
                    .sorted()
                    .toList()
        );
        assertThat(quickSort.accept(array)).containsExactly(expected);
        array = new int[] {2, 5, 9, 9, 7, 3, 8};
        expected = new int[] {2, 3, 5, 7, 8, 9, 9};
        assertThat(quickSort.accept(array)).containsExactly(expected);
    }

}