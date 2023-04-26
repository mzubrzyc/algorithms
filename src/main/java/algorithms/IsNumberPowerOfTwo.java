package algorithms;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * <a href=https://javarevisited.blogspot.com/2013/05/how-to-check-if-integer-number-is-power-of-two-example.html#axzz7wU1Vvr1i>source</a>
 */
@UtilityClass
@Slf4j
public class IsNumberPowerOfTwo {

    public boolean check(int number) throws IllegalAccessException {
        if (number < 0) {
            throw new IllegalAccessException("Given number is less than zero");
        }
        log.info("{} & -{} = {}", number, number, (number & -number));
        return (number & -number) == number;
    }

    public boolean check2(int number) throws IllegalAccessException {
        if (number < 0) {
            throw new IllegalAccessException("Given number is less than zero");
        }
        log.info("{} & -{} = {}", number, number, (number & -number));
        return (number & (number - 1)) == 0;
    }

    /**
     * @param number {@code int}
     * @return {@code boolean} true if number is power of two, elsewhere false
     * @throws IllegalAccessException when number is < 0
     * @implNote int square = 1; square <<= 1 is equivalent of square *= 2
     */
    public boolean check3(int number) throws IllegalAccessException {
        if (number < 0) {
            throw new IllegalAccessException("Given number is less than zero");
        }
        int square = 1;
        while (square <= number) {
            if (square == number) {
                return true;
            }
            square <<= 1;
        }
        return false;
    }

}
