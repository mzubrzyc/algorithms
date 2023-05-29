package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Kata {

    /**
     * The method should add the values of the arrays to one new array.
     * The arrays in the array will all have the same size and this size will always be greater than 0.
     * The shifting value is always a value from 0 up to the size of the arrays.
     * There are always arrays in the array, so you do not need to check for null or empty.
     *
     * @param arrayOfArrays An array of arrays with int-numbers
     * @param shift The shifting value
     * @return array with new values
     * */
    public int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int resultArraySize = calcSizeOfArray(arrayOfArrays[0].length, arrayOfArrays.length, shift);
        int[] resultArray = new int[resultArraySize];
        int innerArrayCounter = 0;
        int resultArrayIndex;
        for (int[] innerArray : arrayOfArrays) {
            for (int i = 0; i < innerArray.length; i++) {
                resultArrayIndex = i + innerArrayCounter * shift;
                resultArray[resultArrayIndex] = resultArray[resultArrayIndex] + innerArray[i];
            }
            innerArrayCounter++;
        }
        return resultArray;
    }

    private int calcSizeOfArray(int arraySize, int numberOfArrays, int shift) {
        return arraySize + (numberOfArrays - 1) * shift;
    }

    /**
     * Input : an array of integers.
     * Output : this array, but sorted in such a way that there are two wings:
     * the left wing with numbers decreasing,
     * the right wing with numbers increasing.
     * the two wings have the same length. If the length of the array is odd the wings are around the bottom, if the length is even the bottom is considered to be part of the right wing.
     * each integer l of the left wing must be greater or equal to its counterpart r in the right wing, the difference l - r being as small as possible. In other words the right wing must be nearly as steep as the left wing.
     * @param arr input array
     * @return resulting array
     * */
    public static int[] makeValley(int[] arr) {
        sortDesc(arr);
        int len = arr.length;
        int lWingLen = len / 2;
        int rWingLen = (int) Math.ceil(len / 2.0);
        int[] lWing = new int[lWingLen];
        int[] rWing = new int[rWingLen];

        if (len % 2 != 0) {
            rWing[rWingLen - 1] = arr[len - 1];
        }
        int wingIndex = 0;
        for (int i = 0; i < len - len % 2; i += 2) {
            lWing[wingIndex] = arr[i];
            rWing[wingIndex] = arr[i + 1];
            wingIndex++;
        }
        Arrays.sort(rWing);
        return IntStream.concat(Arrays.stream(lWing), Arrays.stream(rWing)).toArray();
    }

    private static void sortDesc(int[] arr) {
        Arrays.sort(arr);
        int rightIndex = arr.length - 1;
        int temp;
        for (int leftIndex = 0; leftIndex < rightIndex; leftIndex++, rightIndex--) {
            temp = arr[rightIndex];
            arr[rightIndex] = arr[leftIndex];
            arr[leftIndex] = temp;
        }
    }

}
