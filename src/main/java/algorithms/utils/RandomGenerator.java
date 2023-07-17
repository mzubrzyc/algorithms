package algorithms.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomGenerator {

    private static final RandomGenerator INSTANCE = new RandomGenerator();
    private final SecureRandom secureRandom = new SecureRandom();

    public static RandomGenerator INSTANCE() {
        return INSTANCE;
    }

    /**
     * @param min minimum number we want to get random number for (inclusive)
     * @param max maximum number we want to get random number for (inclusive)
     */
    public int drawForRange(int min, int max) {
        return secureRandom.nextInt(Math.abs(max - min) + 1) + min;
    }

    public List<Character> generateRandomUniqueLetters(int numberOfUniqueLetters, int minLetter, int maxLetter) {
        Set<Character> result = new HashSet<>();
        while (result.size() < numberOfUniqueLetters) {
            result.add((char) drawForRange(minLetter, maxLetter));
        }
        return new ArrayList<>(result);
    }

}
