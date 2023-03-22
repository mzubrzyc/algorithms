package algorithms;

import lombok.experimental.UtilityClass;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.math.BigInteger;

@UtilityClass
public class Factorial {

    public BigInteger calculateRecursively(int n) {
        if (n < 0) {
            throw new RuntimeException("Number is less then zero");
        }
        if (n == 0) {
            return BigInteger.ONE;
        }
        if (n <= 2) {
            return BigInteger.valueOf(n);
        }
        return calculateRecursively(n - 1).multiply(BigInteger.valueOf(n));
    }

    public long usingApacheCommons(int n) {
        return CombinatoricsUtils.factorial(n);
    }

}
