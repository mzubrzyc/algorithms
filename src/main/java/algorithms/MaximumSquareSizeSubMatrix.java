package algorithms;

import lombok.experimental.UtilityClass;

/**
 * <a href=https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/>geeksforgeeks</a>
 * */
@UtilityClass
public class MaximumSquareSizeSubMatrix {

    public int sumMaximumSubMatrix(int[][] inputMatrix) {
        int matrixNoRows = inputMatrix.length;
        int matrixNoColumns = inputMatrix[0].length;
        int[][] auxMatrix = new int[matrixNoRows][matrixNoColumns];

        copyFirstRow(inputMatrix, matrixNoColumns, auxMatrix);
        copyFirstColumn(inputMatrix, matrixNoRows, auxMatrix);
        fillAuxMatrix(inputMatrix, matrixNoRows, matrixNoColumns, auxMatrix);
        return calcMaxElementsOfBiggestSubMatrix(auxMatrix, matrixNoRows, matrixNoColumns);
    }

    private static int calcMaxElementsOfBiggestSubMatrix(int[][] auxMatrix, int matrixNoRows, int matrixNoColumns) {
        int rowIndex;
        int columnIndex;
        int maxSize = auxMatrix[0][0];
        int maxRowIndex = 0;
        int maxColumnIndex = 0;
        int sum = 0;
        for (rowIndex = 0; rowIndex < matrixNoRows; rowIndex++) {
            for (columnIndex = 0; columnIndex < matrixNoColumns; columnIndex++) {
                int currentElementSize = auxMatrix[rowIndex][columnIndex];
                if (maxSize < currentElementSize) {
                    maxSize = currentElementSize;
                    maxRowIndex = rowIndex;
                    maxColumnIndex = columnIndex;
                }
            }
        }
        for (rowIndex = maxRowIndex; rowIndex > maxRowIndex - maxSize; rowIndex--) {
            for (columnIndex = maxColumnIndex; columnIndex > maxColumnIndex - maxSize; columnIndex--) {
                sum++;
            }
        }
        return sum;
    }

    private static void fillAuxMatrix(int[][] inputMatrix, int matrixNoRows, int matrixNoColumns, int[][] auxMatrix) {
        for (int rowIndex = 1; rowIndex < matrixNoRows; rowIndex++) {
            for (int columnIndex = 1; columnIndex < matrixNoColumns; columnIndex++) {
                if (inputMatrix[rowIndex][columnIndex] == 1) {
                    auxMatrix[rowIndex][columnIndex] = calcSize(auxMatrix, rowIndex, columnIndex);
                } else {
                    auxMatrix[rowIndex][columnIndex] = 0;
                }
            }
        }
    }

    /**
     * calc for cell size of bottom right corner of 2x2 matrix
     * e.g. 2 2
     * 2 3
     *
     * @param auxMatrix   target matrix to calculate cell sizes for
     * @param rowIndex    row index we calculate cell size for
     * @param columnIndex column index we calculate cell size for
     * @return number indicating size of the sub matrix containing of consecutive "1"s
     */
    private static int calcSize(int[][] auxMatrix, int rowIndex, int columnIndex) {
        return Math.min(
            auxMatrix[rowIndex][columnIndex - 1],
            Math.min(
                auxMatrix[rowIndex - 1][columnIndex],
                auxMatrix[rowIndex - 1][columnIndex - 1]
            )
        ) + 1;
    }

    private static void copyFirstRow(int[][] matrix, int matrixNoColumns, int[][] auxMatrix) {
        if (matrixNoColumns >= 0) {System.arraycopy(matrix[0], 0, auxMatrix[0], 0, matrixNoColumns);}
    }

    private static void copyFirstColumn(int[][] matrix, int matrixNoRows, int[][] auxMatrix) {
        for (int rowIndex = 0; rowIndex < matrixNoRows; rowIndex++) {
            auxMatrix[rowIndex][0] = matrix[rowIndex][0];
        }
    }

}
