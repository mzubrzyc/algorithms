package algorithms;

import java.util.Arrays;
import java.util.List;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public final class SortBubble {

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
        return Arrays.asList(result);
    }

}
