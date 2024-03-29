package algorithms;

import lombok.experimental.UtilityClass;

/**
 * An Armstrong number is one whose sum of digits raised to the power three equals the number itself.
 */
@UtilityClass
public class ArmstrongNumber {

    public boolean check(int number) {
        int numberOfDigits = DigitsUtil.numberOfDigitsMultiplication(number);
        int originalNumber = number;
        int result = 0;
        int reminder;
        while (number > 0) {
            reminder = number % 10;
            result += Math.pow(reminder, numberOfDigits);
            number /= 10;
        }
        return result == originalNumber;
    }
}
