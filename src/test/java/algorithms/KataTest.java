package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KataTest {

    @Test
    void addingShifted() {
        int[][] arrayOfArrays = new int[][] {
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {7, 7, 7, 7, 7, 7}
        };
        int[] expected = new int[] {8, 9, 10, 11, 12, 13};
        int[] result = Kata.addingShifted(arrayOfArrays, 0);
        assertThat(result).isNotNull().containsExactly(expected);

        arrayOfArrays = new int[][] {
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {7, 7, 7, 7, 7, 7}
        };
        expected = new int[] {1, 2, 3, 11, 12, 13, 7, 7, 7};
        result = Kata.addingShifted(arrayOfArrays, 3);
        assertThat(result).isNotNull().containsExactly(expected);

        arrayOfArrays = new int[][] {
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {7, 7, 7, -7, 7, 7},
            new int[] {1, 1, 1, 1, 1, 1}
        };
        expected = new int[] {1, 2, 3, 11, 12, 13, -6, 8, 8, 1, 1, 1};
        result = Kata.addingShifted(arrayOfArrays, 3);
        assertThat(result).isNotNull().containsExactly(expected);
    }
}