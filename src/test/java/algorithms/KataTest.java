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

    @Test
    void makeValley() {
        int[] a = new int[]{17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1};
        int[] r = new int[]{17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{20, 7, 6, 2};
        r = new int[]{20, 6, 2, 7};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{};
        r = new int[]{};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{79, 35, 54, 19, 35, 25};
        r = new int[]{79, 35, 25, 19, 35, 54};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{67, 93, 100, -16, 65, 97, 92};
        r = new int[]{100, 93, 67, -16, 65, 92, 97};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{66, 55, 100, 68, 46, -82, 12, 72, 12, 38};
        r = new int[]{100, 68, 55, 38, 12, -82, 12, 46, 66, 72};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{14, 14, 14, 14, 7, 14};
        r = new int[]{14, 14, 14, 7, 14, 14};
        assertThat(Kata.makeValley(a)).containsExactly(r);
        a = new int[]{14, 14, 14, 14, 14, 14};
        r = new int[]{14, 14, 14, 14, 14, 14};
        assertThat(Kata.makeValley(a)).containsExactly(r);
    }
}