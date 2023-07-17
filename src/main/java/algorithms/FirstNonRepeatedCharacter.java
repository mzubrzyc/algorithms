package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class FirstNonRepeatedCharacter {

    /**
     * We are using two containers, one contains repeated characters and one unique ones.
     * @param word sequence of letters we are looking the first unique letter for
     * @return first not repeated character
     * */
    public char get(String word) throws LetterNotFoundException {
        Set<Character> repeatedCharacter = new HashSet<>();
        List<Character> nonRepeatedCharacter = new ArrayList<>();

        for (char ch : word.toCharArray()) {
            if (repeatedCharacter.contains(ch)) {
                continue;
            }
            if (nonRepeatedCharacter.contains(ch)) {
                nonRepeatedCharacter.remove((Character) ch);
                repeatedCharacter.add(ch);
            } else {
                nonRepeatedCharacter.add(ch);
            }
        }
        if (nonRepeatedCharacter.isEmpty()) {
            throw new LetterNotFoundException("No unique letter found");
        }
        return nonRepeatedCharacter.get(0);
    }

    /**
     * We are using stream
     * @param word sequence of letters we are looking the first unique letter for
     * @return first not repeated character
     * */
    public char getUsingStream(String word) throws LetterNotFoundException {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        for (char ch : word.toCharArray()) {
            charCounts.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        return charCounts.entrySet()
                         .stream()
                         .filter(entry -> entry.getValue() == 1)
                         .findFirst()
                         .orElseThrow(() -> new LetterNotFoundException("No unique letter found"))
                         .getKey();
    }

    class LetterNotFoundException extends Exception {
        public LetterNotFoundException() {
            super();
        }

        public LetterNotFoundException(String message) {
            super(message);
        }

        public LetterNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        public LetterNotFoundException(Throwable cause) {
            super(cause);
        }

        public LetterNotFoundException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
        ) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

}
