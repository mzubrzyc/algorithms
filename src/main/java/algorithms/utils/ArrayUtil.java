package algorithms.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ArrayUtil {

    public void swap(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }

}
