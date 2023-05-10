package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import fixture.ArrayUtil;
import fixture.NumberGenerationFixture;
import java.util.List;
import org.junit.jupiter.api.Test;

class SortQuickTest {

    @Test
    void run() {
        List<Integer> integers = NumberGenerationFixture.generateListOfRandomIntNumbers(10, 10);
        int[] array = ArrayUtil.fromListOfIntegers(integers);
        int[] sortedResult = ArrayUtil.fromListOfIntegers(
            integers.stream()
                    .sorted()
                    .toList()
        );
        SortQuick.run(array);
        assertThat(array).containsExactly(sortedResult);
        array = new int[] {2, 5, 9, 9, 7, 3, 8};
        SortQuick.run(array);
        assertThat(array).containsExactly(2, 3, 5, 7, 8, 9, 9);
    }
}