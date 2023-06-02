package algorithms.sort;

import java.util.Arrays;

/**
 * <a href="https://www.youtube.com/watch?v=bOk35XmHPKs">link</a>
 */
public class MergeSort implements SortAlgorithm {

    private static final MergeSort INSTANCE = new MergeSort();

    private MergeSort() {

    }

    @Override
    public int[] accept(int[] inputArray) {
        return sort(inputArray);
    }

    private int[] sort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return inputArray;
        }

        int leftHalfLength = inputLength / 2;
        int[] leftHalf = sort(Arrays.copyOfRange(inputArray, 0, leftHalfLength));
        int[] rightHalf = sort(Arrays.copyOfRange(inputArray, leftHalfLength, inputLength));

        return merge(inputArray, leftHalf, rightHalf);
    }

    private int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftHalfLength = leftHalf.length;
        int rightHalfLength = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftHalfLength && j < rightHalfLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftHalfLength) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalfLength) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
        return inputArray;
    }

    public static MergeSort getInstance() {
        return INSTANCE;
    }

}
