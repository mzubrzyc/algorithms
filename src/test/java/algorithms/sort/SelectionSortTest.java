package algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

    private final SelectionSort selectionSort = SelectionSort.getInstance();

    @Test
    void accept() {
        int[] array = new int[] {5, 2, 1, 9, 7, 3, 8};
        int[] expected = new int[] {1, 2, 3, 5, 7, 8, 9};
        assertThat(selectionSort.accept(array)).containsExactly(expected);
    }
}