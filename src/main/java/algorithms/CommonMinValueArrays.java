package algorithms;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommonMinValueArrays {

    /**
     * Find minimum value existing in both tables
     * {@return int positive number if found -1 otherwise}
     */
    public int find(int[] arrayA, int[] arrayB) {
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int indexForLastSmallerEqualNumberA = 0;
        int currentItemA;
        for (int currentItemB : arrayB) {
            indexForLastSmallerEqualNumberA = getIndexForLastSmallerEqualNumber(arrayA, currentItemB, indexForLastSmallerEqualNumberA);
            currentItemA = arrayA[indexForLastSmallerEqualNumberA];
            if (currentItemB == currentItemA) {
                return currentItemB;
            } else if (indexForLastSmallerEqualNumberA == arrayA.length - 1 && currentItemA < currentItemB) {
                return -1;
            }
        }
        return -1;
    }

    public int findVer2(int[] arrayA, int[] arrayB) {
        int n = arrayA.length;
        int m = arrayB.length;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && arrayB[i] < arrayA[k]) {
                i++;
            }
            if (arrayA[k] == arrayB[i]) {
                return arrayA[k];
            }
        }
        return -1;
    }

    private static int getIndexForLastSmallerEqualNumber(int[] array, int number, int startIndex) {
        if (startIndex == array.length - 1) {
            return startIndex;
        }
        int resultIndex = startIndex - 1;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] <= number) {
                resultIndex++;
            }
        }
        return resultIndex;
    }

}
