package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

    private final InsertionSort insertionSort = InsertionSort.getInstance();

    @Test
    void accept() {
        int[] ints = new int[] {1, 12, 9, 5, 6, 10};
        int[] expected = new int[] {1, 5, 6, 9, 10, 12};
        assertThat(insertionSort.accept(ints)).containsExactly(expected);
        ints = new int[] {9, 9, 8, 8, 3, 2, 2, 3, 2, 1};
        expected = new int[] {1, 2, 2, 2, 3, 3, 8, 8, 9, 9};
        assertThat(insertionSort.accept(ints)).containsExactly(expected);
    }
}