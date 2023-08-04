package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PreviousNextSmallerElementTest {

    @Test
    void previous_smaller_element() {
        int[] inputArray = new int[] {4, 10, 5, 18, 3, 12, 7};
        int[] expected = new int[] {-1, 4, 4, 5, -1, 3, 3};
        int[] result = PreviousNextSmallerElement.calculatePrevious(inputArray);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void next_smaller_element() {
        int[] inputArray = new int[] {3, 10, 5, 1, 15, 10, 7, 6};
        int[] expected = new int[] {1, 5, 1, -1, 10, 7, 6, -1};
        int[] result = PreviousNextSmallerElement.calculateNext(inputArray);
        assertThat(result).containsExactly(expected);
    }
}