package algorithms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

class ElementsInArrayProviderTest {

    @Test
    void first_k_largest_elements() {
        int[] inputArray = new int[] {10, 2, 1, 1, 8, 12, 7};
        int[] result = ElementsInArrayProvider.firstLargest(inputArray, 3);
        assertThat(result).containsAnyOf(10, 8, 12);
    }

    @Test
    void first_k_smallest_elements() {
        int[] inputArray = new int[] {10, 2, 1, 1, 8, 12, 7};
        int[] result = ElementsInArrayProvider.firstSmallest(inputArray, 3);
        assertThat(result).containsAnyOf(1, 2, 7);
    }

    @Test
    void throw_exception() {
        int[] inputArray = new int[] {10, 2, 1, 1, 8, 12, 7};
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> ElementsInArrayProvider.firstSmallest(inputArray, 12));
    }
}