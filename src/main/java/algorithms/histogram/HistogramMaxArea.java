package algorithms.histogram;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HistogramMaxArea {

    /**
     * Calculates max areas for histogram values.
     * @param inputArray an array containing of values of histogram
     * @return the very largest area
     * */
    public int calc(int[] inputArray) {
        int inputArraySize = inputArray.length;
        int[] nextSmallerElements = PreviousNextSmallerElement.calculateNext(inputArray);
        int[] previousSmallerElements = PreviousNextSmallerElement.calculatePrevious(inputArray);
        int[] areas = new int[inputArraySize];
        for (int i = 0; i < inputArraySize; i++) {
            areas[i] = (nextSmallerElements[i] - previousSmallerElements[i] - 1) * inputArray[i];
        }
        return Arrays.stream(areas)
                     .max()
                     .orElse(-1);
    }
}
