package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PalindromChecker {

    public boolean isPalindrome(String sequence) {
        return StringManipulations.reverseStringRecursiveMethod(sequence).equalsIgnoreCase(sequence);
    }

    public boolean isPalindrome(int number) {
        int reversedNumber = DigitsUtil.reverseDigits(number);
        return number == reversedNumber;
    }

}
