package algorithms;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ElementsInArrayProvider {

    /**
     * @param array containing input integers
     * @param k number of first largest elements in the array
     * @return first k number of largest elements in the array
     * */
    public int[] firstLargest(int[] array, int k) {
        int size = array.length;
        check(size, k);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(array[i]);
        }
        for (int i = k; i < size; i++) {
            if (Objects.requireNonNull(minHeap.peek()) < array[i]) {
                minHeap.poll();
                minHeap.add(array[i]);
            }
        }
        return minHeap.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * @param array containing input integers
     * @param k number of first smallest elements in the array
     * @return first k number of smallest elements in the array
     * */
    public int[] firstSmallest(int[] array, int k) {
        int size = array.length;
        check(size, k);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            maxHeap.add(array[i]);
        }
        for (int i = k; i < size; i++) {
            if (Objects.requireNonNull(maxHeap.peek()) > array[i]) {
                maxHeap.poll();
                maxHeap.add(array[i]);
            }
        }
        return maxHeap.stream().mapToInt(Integer::valueOf).toArray();
    }

    private static void check(int size, int k) {
        if (k > size) {
            throw new IllegalArgumentException("k is larger than the size of the array");
        }
    }

}