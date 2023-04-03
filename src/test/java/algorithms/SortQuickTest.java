package algorithms;

import fixture.ArrayUtil;
import fixture.NumberGenerationFixture;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        Assertions.assertThat(array).containsExactly(sortedResult);
    }
}