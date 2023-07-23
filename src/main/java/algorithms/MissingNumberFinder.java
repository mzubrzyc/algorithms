package algorithms;

import java.util.ArrayList;
import java.util.List;
import lombok.experimental.UtilityClass;

/**
 * Find missing elements in the given range
 */
@UtilityClass
public class MissingNumberFinder {

    /**
     * @param arr array of int numbers we are looking for missing number in
     * @param n   int number marking the biggest number in provided number range
     */
    public List<Integer> find(int[] arr, int n) {
        int arrLength = arr.length;
        int[] temp = new int[n];
        int i;
        for (i = 0; i < arrLength; i++) {
            temp[arr[i] - 1] = 1;
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumbers.add(i + 1);
            }
        }
        return missingNumbers;
    }

}
