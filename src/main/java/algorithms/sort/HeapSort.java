package algorithms.sort;

import algorithms.utils.ArrayUtil;

/**
 * <a href = "https://www.programiz.com/dsa/heap-sort">link</a>
 * Complexity O(n log(n))
 */
public class HeapSort implements SortAlgorithm {

    private static final HeapSort INSTANCE = new HeapSort();

    private HeapSort() {
    }

    public static HeapSort getInstance() {
        return INSTANCE;
    }

    public int[] accept(int[] inputArray) {
        int[] inputArrayClone = inputArray.clone();
        buildMaxHeap(inputArrayClone);
        sort(inputArrayClone);
        return inputArrayClone;
    }

    private void sort(int[] inputArray) {
        for (int lastIndex = inputArray.length - 1; lastIndex >= 0; lastIndex--) {
            ArrayUtil.swap(inputArray, lastIndex, 0);
            heapify(inputArray, lastIndex, 0);
        }
    }

    /**
     * For a complete tree, the first index of a non-leaf node is given by n/2 - 1
     */
    private void buildMaxHeap(int[] inputArray) {
        int heapSize = inputArray.length;

        for (int parentIndex = heapSize / 2 - 1;
             parentIndex >= 0;
             parentIndex--
        ) {
            heapify(inputArray, heapSize, parentIndex);
        }
    }

    private void heapify(int[] inputArray, int heapSize, int parentIndex) {
        int leftChildIndex = leftChildIndex(parentIndex);
        int rightChildIndex = rightChildIndex(parentIndex);
        int largerItemIndex = parentIndex;

        if (leftChildIndex < heapSize && inputArray[leftChildIndex] > inputArray[largerItemIndex]) {
            largerItemIndex = leftChildIndex;
        }

        if (rightChildIndex < heapSize && inputArray[rightChildIndex] > inputArray[largerItemIndex]) {
            largerItemIndex = rightChildIndex;
        }

        if (largerItemIndex != parentIndex) {
            ArrayUtil.swap(inputArray, largerItemIndex, parentIndex);
            heapify(inputArray, heapSize, largerItemIndex);
        }

    }

    private int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private int leftChildIndex(int parentIndex) {
        return parentIndex * 2 + 1;
    }

    private int rightChildIndex(int parentIndex) {
        return parentIndex * 2 + 2;
    }

}
