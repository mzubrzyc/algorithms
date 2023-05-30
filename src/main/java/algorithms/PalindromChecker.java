package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PalindromChecker {

    public boolean isPalindromeCaseInsensitive(String sequence) {
        return StringManipulations.reverseStringRecursiveMethod(sequence).equalsIgnoreCase(sequence);
    }

    public boolean isPalindromeIterativeCheckCaseSensitive(String sequence) {
        for (int i = 0; i < sequence.length() / 2; i++) {
            if (sequence.charAt(i) != sequence.charAt(sequence.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int number) {
        int reversedNumber = DigitsUtil.reverseDigits(number);
        return number == reversedNumber;
    }

}
