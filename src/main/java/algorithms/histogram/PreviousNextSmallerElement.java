package algorithms.histogram;

import java.util.ArrayDeque;
import java.util.Deque;
import lombok.experimental.UtilityClass;

/**
 * Calculates indexes of the Nearest Smaller Elements on Left and Right side of an Array
 * -1 or array_size if there is no nearest value for the element on the left or the right side respectively
 */
@UtilityClass
public class PreviousNextSmallerElement {

    public int[] calculatePrevious(int[] inputArray) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            result[i] = calcSmallerForCurrent(inputArray, i, queue, Direction.LEFT);
        }
        return result;
    }

    public int[] calculateNext(int[] inputArray) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0; i--) {
            result[i] = calcSmallerForCurrent(inputArray, i, queue, Direction.RIGHT);
        }
        return result;
    }

    private static int calcSmallerForCurrent(
        int[] array,
        int currentIndex,
        Deque<Integer> queue,
        Direction direction
    ) {
        int result;
        while (!queue.isEmpty() && array[queue.peek()] >= array[currentIndex]) {
            queue.pop();
        }
        if (queue.isEmpty()) {
            result = direction.getExtremeIndex(array.length);
        } else {
            result = queue.peek();
        }
        queue.push(currentIndex);
        return result;
    }

    enum Direction {
        LEFT(0, -1),
        RIGHT(1, 0);

        private final int scalar1;
        private final int scalar2;

        Direction(int scalar1, int scalar2) {
            this.scalar1 = scalar1;
            this.scalar2 = scalar2;
        }

        int getExtremeIndex(int size) {
            return this.scalar1 * size + scalar2;
        }

    }

}

