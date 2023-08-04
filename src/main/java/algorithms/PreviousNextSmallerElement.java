package algorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import lombok.experimental.UtilityClass;

/**
 * Nearest Smaller Element on Left and Right side of an Array
 */
@UtilityClass
public class PreviousNextSmallerElement {

    public int[] calculatePrevious(int[] inputArray) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            result[i] = calcSmallerForCurrent(inputArray[i], queue);
        }
        return result;
    }

    public int[] calculateNext(int[] inputArray) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0; i--) {
            result[i] = calcSmallerForCurrent(inputArray[i], queue);
        }
        return result;
    }

    private static int calcSmallerForCurrent(int currentElement, Deque<Integer> queue) {
        int result;
        while (!queue.isEmpty() && queue.peek() >= currentElement) {
            queue.pop();
        }
        if (queue.isEmpty()) {
            result = -1;
        } else {
            result = queue.peek();
        }
        queue.push(currentElement);
        return result;
    }

}

