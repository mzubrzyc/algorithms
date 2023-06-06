package algorithms.sort;

import algorithms.utils.ArrayUtil;

/**
 * <a href="https://www.programiz.com/dsa/selection-sort">programiz.com</a>
 */
public class SelectionSort implements SortAlgorithm {

    private static final SelectionSort INSTANCE = new SelectionSort();

    private SelectionSort() {
    }

    public static SelectionSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] accept(int[] inputArray) {
        int[] inputArrayClone = inputArray.clone();
        sort(inputArrayClone);
        return inputArrayClone;
    }

    private void sort(int[] inputArrayClone) {
        int tempMinValueIndex;
        for (int checkingIndex = 0; checkingIndex < inputArrayClone.length; checkingIndex++) {
            tempMinValueIndex = checkingIndex;
            for (int searchingIndex = checkingIndex + 1; searchingIndex < inputArrayClone.length; searchingIndex++) {
                if (inputArrayClone[searchingIndex] < inputArrayClone[tempMinValueIndex]) {
                    tempMinValueIndex = searchingIndex;
                }
            }
            if (tempMinValueIndex != checkingIndex) {
                ArrayUtil.swap(inputArrayClone, checkingIndex, tempMinValueIndex);
            }
        }
    }
}

