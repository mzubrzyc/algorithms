package algorithms;

import java.util.ArrayList;
import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MissingNumberFinder {

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
