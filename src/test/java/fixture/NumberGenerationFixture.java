package fixture;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Slf4j
@UtilityClass
public final class NumberGenerationFixture {

    public List<Integer> generateArrayOfRandomIntNumbers(long size, int upperLimit) {
        final Random random;
        try {
            random = SecureRandom.getInstance("NativePRNG");
        } catch (NoSuchAlgorithmException e) {
            log.error("Error", e);
            throw new RuntimeException(e);
        }
        return Stream.generate(() -> random.nextInt(upperLimit)).limit(size).toList();
    }
    public List<Integer> generateArrayOfRandomIntNumbers(long size) {
        return generateArrayOfRandomIntNumbers(size, Integer.MAX_VALUE);
    }

}
