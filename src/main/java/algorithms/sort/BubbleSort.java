package algorithms.sort;

public final class BubbleSort implements SortAlgorithm {

    private static final BubbleSort INSTANCE = new BubbleSort();

    private BubbleSort() {
    }

    public static BubbleSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] accept(int[] inputArray) {
        int[] inputArrayClone = inputArray.clone();
        sort(inputArrayClone);
        return inputArrayClone;
    }

    public void sort(int[] inputArray) {
        int temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swapped = true;
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }
        } while (swapped);
    }
}
