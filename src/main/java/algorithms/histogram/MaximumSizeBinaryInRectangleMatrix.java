package algorithms.histogram;

import lombok.experimental.UtilityClass;

/**
 * It calculates max area for each row treating it as histogram.
 * Moving to the next row we merge current values with previous one and process is repeated.
 * */
@UtilityClass
public class MaximumSizeBinaryInRectangleMatrix {

    public int find(int[][] inputArray) {
        int size = inputArray.length;
        int[] previousRow = inputArray[0];
        int maxArea = HistogramMaxArea.calc(previousRow);
        for (int i = 1; i < size; i++) {
            int[] currentRow = inputArray[i];
            int[] mergedRow = mergeRows(currentRow, previousRow, currentRow.length);
            maxArea = Math.max(maxArea, HistogramMaxArea.calc(mergedRow));
            previousRow = mergedRow;
        }
        return maxArea;
    }

    private int[] mergeRows(int[] currentRow, int[] previousRow, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = currentRow[i] * previousRow[i] + currentRow[i];
        }
        return result;
    }

}
