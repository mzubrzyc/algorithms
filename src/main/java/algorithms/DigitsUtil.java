package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DigitsUtil {

    public int numberOfDigitsRecursive(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return number;
        }
        return 1 + numberOfDigitsRecursive(number / 10);
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
        if (number == 0) {
            return 0;
        }
        int length = 1;
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

    public long sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }

    public int reverseDigits(int number) {
        if (number == 0) {
            return 0;
        }
        int absNumber = Math.abs(number);
        int sign = number / absNumber;
        int reversedNumber = 0;
        int reminder;
        int tempNumber = absNumber;
        while (tempNumber > 0) {
            reminder = tempNumber % 10;
            tempNumber /= 10;
            reversedNumber = reversedNumber * 10 + reminder;
        }
        return reversedNumber * sign;
    }
}
