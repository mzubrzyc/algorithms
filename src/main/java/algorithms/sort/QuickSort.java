package algorithms.sort;

import algorithms.utils.ArrayUtil;
import algorithms.utils.RandomGenerator;
import lombok.extern.slf4j.Slf4j;

/**
 * <a href="https://www.youtube.com/watch?v=h8eyY7dIiN4">YouTube</a><br> - solution used in this file
 * <a href="https://www.programiz.com/dsa/quick-sort">programiz.com</a> - much slower solution than YouTube option
 */
@Slf4j
public class QuickSort implements SortAlgorithm {

    private static final QuickSort INSTANCE = new QuickSort();
    private final RandomGenerator randomGenerator;

    private QuickSort() {
        this.randomGenerator = RandomGenerator.INSTANCE();
    }

    public static QuickSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] accept(int[] inputArray) {
        int[] inputArrayClone = inputArray.clone();
        sort(inputArrayClone, 0, inputArrayClone.length - 1);
        return inputArrayClone;
    }

    /**
     * Quick sort input array. Pivot number (number used to separate smaller and bigger numbers) is randomized.
     *
     * @param array     to be sorted
     * @param lowIndex  min index of the array
     * @param highIndex max index of the array
     */
    private void sort(
        int[] array,
        int lowIndex,
        int highIndex
    ) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pivotIndex = randomizePivot(
            lowIndex,
            highIndex
        );
        int pivot = array[pivotIndex];
        ArrayUtil.swap(
            array,
            pivotIndex,
            highIndex
        );
        int leftPointer = partition(
            array,
            lowIndex,
            highIndex,
            pivot
        );
        sort(
            array,
            lowIndex,
            leftPointer - 1
        );
        sort(
            array,
            leftPointer + 1,
            highIndex
        );
    }

    private int partition(
        int[] array,
        int lowIndex,
        int highIndex,
        int pivot
    ) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (array[leftPointer] < pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            if (leftPointer != rightPointer) {
                ArrayUtil.swap(
                    array,
                    leftPointer,
                    rightPointer
                );
            }
        }
        if (leftPointer != highIndex) {
            ArrayUtil.swap(
                array,
                leftPointer,
                highIndex
            );
        }
        return leftPointer;
    }

    private int randomizePivot(int lowIndex, int highIndex) {
        return randomGenerator.drawForRange(lowIndex, highIndex);
    }

}
