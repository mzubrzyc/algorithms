package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Fibonacci {

    public long findNthElement(long n) {
        long result = calcForZeroOrOne(n);
        return result >= 0 ? result : findNthElement(n - 2) + findNthElement(n - 1);
    }

    private static long calcForZeroOrOne(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return -1;
        }
    }
}
