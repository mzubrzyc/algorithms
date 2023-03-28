package algorithms;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class LargestPrimeFactor {

    /**
     * Refer to <a href=https://javarevisited.blogspot.com/2015/03/how-to-find-largest-prime-factor-of.html#axzz7w1cHBtKe>link</a>
     *
     * @param number we want to find the Largest Prime Factor for
     * @return long Largest Prime Factor
     */
    public int find(long number) {
        if (number < 2) {
            return -1;
        }
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = number / i;
                i--;
            }
        }
        return i;
    }

    /**
     * Refer to <a href=https://www.geeksforgeeks.org/find-largest-prime-factor-number/>geeksForGeeks</a>
     *
     * @param number we want to find the Largest Prime Factor for
     * @return long Largest Prime Factor
     */
    public long find2(long number) {
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        long maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (number % 2 == 0) {
            maxPrime = 2;

            // equivalent to n /= 2
            number >>= 1;
        }
        // n must be odd at this point
        while (number % 3 == 0) {
            maxPrime = 3;
            number = number / 3;
        }

        // now we have to iterate only for integers
        // which do not have prime factor 2 and 3
        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            while (number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
            while (number % (i + 2) == 0) {
                maxPrime = i + 2L;
                number = number / (i + 2);
            }
        }

        // This condition is to handle the case
        // when n is a prime number greater than 4
        if (number > 4) {maxPrime = number;}

        return maxPrime;
    }
}
