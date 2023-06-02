package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    private final SortAlgorithm mergeSort = MergeSort.getInstance();

    @Test
    void sort() {
        int[] ints = new int[] {9, 9, 8, 8, 3, 2, 2, 3, 2, 1};
        int[] expected = new int[] {1, 2, 2, 2, 3, 3, 8, 8, 9, 9};
        assertThat(mergeSort.accept(ints)).containsExactly(expected);
    }
}