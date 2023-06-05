package algorithms.sort;

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

    private void sort(int[] inputArrayClone) {

    }
}
