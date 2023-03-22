package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PrimeNumber {

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
