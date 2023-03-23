package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    @Test
    void search() {
        int[] numbers = {1, 2, 4, 5, 7, 9, 11};
        assertThat(BinarySearch.search(numbers, 0)).isEqualTo(-1);
        assertThat(BinarySearch.search(numbers, 1)).isEqualTo(1);
        assertThat(BinarySearch.search(numbers, 2)).isEqualTo(2);
        assertThat(BinarySearch.search(numbers, 4)).isEqualTo(4);
        assertThat(BinarySearch.search(numbers, 5)).isEqualTo(5);
        assertThat(BinarySearch.search(numbers, 7)).isEqualTo(7);
        assertThat(BinarySearch.search(numbers, 9)).isEqualTo(9);
        assertThat(BinarySearch.search(numbers, 11)).isEqualTo(11);
        assertThat(BinarySearch.search(numbers, 12)).isEqualTo(-1);
    }
}