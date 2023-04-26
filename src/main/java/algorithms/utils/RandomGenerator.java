package algorithms.utils;

import java.security.SecureRandom;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class RandomGenerator {

    public int drawForRange(int min, int max) {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(Math.abs(max - min)) + min;
    }

}
