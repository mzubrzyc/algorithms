package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private static final int[] NUMBERS = {1, 2, 4, 5, 7, 9, 11};

    @Test
    void search() {
        assertThat(BinarySearch.search(NUMBERS, 0)).isEqualTo(-1);
        assertThat(BinarySearch.search(NUMBERS, 1)).isZero();
        assertThat(BinarySearch.search(NUMBERS, 2)).isEqualTo(1);
        assertThat(BinarySearch.search(NUMBERS, 4)).isEqualTo(2);
        assertThat(BinarySearch.search(NUMBERS, 5)).isEqualTo(3);
        assertThat(BinarySearch.search(NUMBERS, 7)).isEqualTo(4);
        assertThat(BinarySearch.search(NUMBERS, 9)).isEqualTo(5);
        assertThat(BinarySearch.search(NUMBERS, 11)).isEqualTo(6);
        assertThat(BinarySearch.search(NUMBERS, 12)).isEqualTo(-1);
    }

    @Test
    void searchRecursive() {
        assertThat(BinarySearch.searchRecursive(NUMBERS, 0, 0, NUMBERS.length - 1)).isEqualTo(-1);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 1, 0, NUMBERS.length - 1)).isZero();
        assertThat(BinarySearch.searchRecursive(NUMBERS, 2, 0, NUMBERS.length - 1)).isEqualTo(1);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 4, 0, NUMBERS.length - 1)).isEqualTo(2);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 5, 0, NUMBERS.length - 1)).isEqualTo(3);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 7, 0, NUMBERS.length - 1)).isEqualTo(4);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 9, 0, NUMBERS.length - 1)).isEqualTo(5);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 11, 0, NUMBERS.length - 1)).isEqualTo(6);
        assertThat(BinarySearch.searchRecursive(NUMBERS, 12, 0, NUMBERS.length - 1)).isEqualTo(-1);
    }
}