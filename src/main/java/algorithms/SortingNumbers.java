package algorithms;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
@UtilityClass
public final class SortingNumbers {

    public List<Integer> bubbleSort(List<Integer> numbers) {
        int temp;
        Integer[] result = numbers.toArray(Integer[]::new);
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    swapped = true;
                    temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                }
            }
        } while (swapped);
        return Arrays.stream(result).toList();
    }

}
