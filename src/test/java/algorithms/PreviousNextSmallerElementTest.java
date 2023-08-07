package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PreviousNextSmallerElementTest {

    @Test
    void previous_smaller_element() {
        int[] inputArray = new int[] {4, 10, 5, 18, 3, 12, 7};
        int[] expected = new int[] {-1, 0, 0, 2, -1, 4, 4};
        assertThat(PreviousNextSmallerElement.calculatePrevious(inputArray)).containsExactly(expected);
        inputArray = new int[] {4, 2, 1, 5, 6, 3, 2, 4, 2};
        expected = new int[] {-1, -1, -1, 2, 3, 2, 2, 6, 2};
        assertThat(PreviousNextSmallerElement.calculatePrevious(inputArray)).containsExactly(expected);
        inputArray = new int[] {4, 2, 2, 5, 6, 3, 2, 4, 2};
        expected = new int[] {-1, -1, -1, 2, 3, 2, -1, 6, -1};
        assertThat(PreviousNextSmallerElement.calculatePrevious(inputArray)).containsExactly(expected);
    }

    @Test
    void next_smaller_element() {
        int[] inputArray = new int[] {3, 10, 5, 1, 15, 10, 7, 6};
        int[] expected = new int[] {3, 2, 3, 8, 5, 6, 7, 8};
        assertThat(PreviousNextSmallerElement.calculateNext(inputArray)).containsExactly(expected);
        inputArray = new int[] {4, 2, 1, 5, 6, 3, 2, 4, 2};
        expected = new int[] {1, 2, 9, 5, 5, 6, 9, 8, 9};
        assertThat(PreviousNextSmallerElement.calculateNext(inputArray)).containsExactly(expected);
    }
}