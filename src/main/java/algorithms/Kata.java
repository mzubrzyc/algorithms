package algorithms;

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

}
