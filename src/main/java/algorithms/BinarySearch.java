package algorithms;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

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
                return numberToFind;
            }
            if (numberToFind < middleNumber) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }
        return -1;
    }
}
