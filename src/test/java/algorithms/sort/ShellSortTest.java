package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import fixture.ArrayUtil;
import fixture.NumberGenerationFixture;
import java.util.List;
import org.junit.jupiter.api.Test;

class ShellSortTest {

    private final ShellSort shellSort = ShellSort.getInstance();

    @Test
    void accept() {
        List<Integer> integers = NumberGenerationFixture.generateListOfRandomIntNumbers(10, 10);
        int[] array = ArrayUtil.fromListOfIntegers(integers);
        int[] expected = ArrayUtil.fromListOfIntegers(
            integers.stream()
                    .sorted()
                    .toList()
        );
        assertThat(shellSort.accept(array)).containsExactly(expected);
        array = new int[] {9, 8, 3, 7, 5, 6, 4, 1};
        expected = new int[] {1, 3, 4, 5, 6, 7, 8, 9};
        assertThat(shellSort.accept(array)).containsExactly(expected);
    }
}