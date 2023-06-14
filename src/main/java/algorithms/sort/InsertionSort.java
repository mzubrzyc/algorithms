package algorithms.sort;

/**
 * <a href="https://www.programiz.com/dsa/bubble-sort">programiz.com</a>
 * */
public class InsertionSort implements SortAlgorithm {

    private static final InsertionSort INSTANCE = new InsertionSort();

    private InsertionSort() {
    }

    public static InsertionSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] accept(int[] inputArray) {
        int[] inputArrayClone = inputArray.clone();
        sort(inputArrayClone);
        return inputArrayClone;
    }

    private void sort(int[] inputArray) {
        for (int upperIndex = 1; upperIndex < inputArray.length; upperIndex++) {
            int upperValue = inputArray[upperIndex];
            int checkIndex = upperIndex - 1;
            while (checkIndex >= 0 && inputArray[checkIndex] > upperValue) {
                inputArray[checkIndex + 1] = inputArray[checkIndex];
                --checkIndex;
            }
            inputArray[checkIndex + 1] = upperValue;
        }
    }
}
