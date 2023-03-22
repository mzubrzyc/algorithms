package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DigitsUtil {

    public int sumDigits(int number) {
        if (number == 0) {
            return number;
        }
        return number % 10 + sumDigits(number / 10);
    }

    public int numberOfDigitsMultiplication(int number) {
        int length = 0;
        int temp = 1;
        while (temp <= number) {
            length += 1;
            temp *= 10;
        }
        return length;
    }

    public int numberOfDigitsDigitsDividingWithPowersOfTwo(int number) {
        int length = 1;
        if (number == 0) {
            return 0;
        }
        if (number >= 100000000) {
            length += 8;
            number /= 100000000;
        }
        if (number >= 10000) {
            length += 4;
            number /= 10000;
        }
        if (number >= 100) {
            length += 2;
            number /= 100;
        }
        if (number >= 10) {
            length += 1;
        }
        return length;
    }
}
