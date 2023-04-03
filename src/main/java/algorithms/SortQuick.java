package algorithms;

import algorithms.utils.RandomGenerator;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * <a href="https://www.youtube.com/watch?v=h8eyY7dIiN4">link</a>
 * */
@UtilityClass
@Slf4j
public class SortQuick {

    public void run(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(
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
        swapArrayElements(
                array,
                pivotIndex,
                highIndex
        );
        log.info("lowIndex: {}", lowIndex);
        log.info("highIndex: {}",  highIndex);
        log.info("pivotIndex: {}", pivotIndex);
        log.info("pivot: {}", pivot);
        int leftPointer = partitioning(
                array,
                lowIndex,
                highIndex,
                pivot
        );
        quickSort(
                array,
                lowIndex,
                leftPointer - 1
        );
        quickSort(
                array,
                leftPointer + 1,
                highIndex
        );
    }

    private int randomizePivot(int lowIndex, int highIndex) {
        return RandomGenerator.drawForRange(lowIndex, highIndex);
    }

    private int partitioning(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            if (leftPointer != rightPointer) {
                swapArrayElements(
                        array,
                        leftPointer,
                        rightPointer
                );
            }
        }
        swapArrayElements(
                array,
                leftPointer,
                highIndex
        );
        return leftPointer;
    }

    private static void swapArrayElements(int[] array, int index1, int index2) {
        log.info("swapping, array: {}, index1: {}, index2: {}", Arrays.toString(array), index1, index2);
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
