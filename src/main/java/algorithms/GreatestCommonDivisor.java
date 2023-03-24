package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class GreatestCommonDivisor {

    public int calculate(int firstNumber, int secondNumber) {
        if (firstNumber < 1 || secondNumber < 1) {
            return -1;
        }
        int gbc = 1;
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gbc = i;
            }
        }
        return gbc;
    }

    public int calculateEuclidAlgorithm(int firstNumber, int secondNumber) {
        if (firstNumber < 0 || secondNumber < 0) {
            return -1;
        }
        if (secondNumber == 0) {
            return firstNumber;
        }
        return calculateEuclidAlgorithm(secondNumber, firstNumber % secondNumber);
    }

}
