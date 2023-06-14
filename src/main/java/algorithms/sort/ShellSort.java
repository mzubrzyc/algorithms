package algorithms.sort;

/**
 * <a href="https://www.programiz.com/dsa/shell-sort">programiz.com</a>
 * */
public class ShellSort implements SortAlgorithm{

    private static final ShellSort INSTANCE = new ShellSort();

    private ShellSort() {

    }

    public static ShellSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] accept(int[] inputArray) {
        int[] inputArrayClone = inputArray.clone();
        return sort(inputArrayClone);
    }

    private int[] sort(int[] inputArray) {
        int size = inputArray.length;
        for (int step = getInitialStep(size); step > 0; step = nextStep(step)) {
            for (int upperIndex = step; upperIndex < size; upperIndex++) {
                int upperValue = inputArray[upperIndex];
                int checkIndex = upperIndex;
                while(checkIndex >= step && inputArray[checkIndex - step] > upperValue) {
                    inputArray[checkIndex] = inputArray[checkIndex - step];
                    checkIndex -= step;
                }
                inputArray[checkIndex] = upperValue;
            }
        }
        return inputArray;
    }

    private int getInitialStep(int size) {
        return size / 2;
    }

    private int nextStep(int currentStep) {
        return currentStep / 2;
    }

}
