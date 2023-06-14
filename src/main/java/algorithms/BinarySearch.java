package algorithms;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

/**
 * We narrow the serach to the half containing (or not) the searching number.
 */
@UtilityClass
public class BinarySearch {

    public int search(int[] numbers, int numberToFind) {
        Arrays.sort(numbers);
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleNumber = numbers[middleIndex];
            if (numberToFind == middleNumber) {
                return middleIndex;
            }
            if (numberToFind < middleNumber) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }
        return -1;
    }

    public int searchRecursive(int[] numbers, int numberToFind, int low, int high) {
        if (high >= low) {
            int middleIndex = low + (high - low) / 2;
            if (numberToFind == numbers[middleIndex]) {
                return middleIndex;
            }
            if (numberToFind < numbers[middleIndex]) {
                return searchRecursive(numbers, numberToFind, low, middleIndex - 1);
            }
            return searchRecursive(numbers, numberToFind, middleIndex + 1, high);
        }
        return -1;
    }

}
