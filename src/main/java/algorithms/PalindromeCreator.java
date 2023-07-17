package algorithms;

import algorithms.utils.RandomGenerator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromeCreator {

    private final RandomGenerator randomGenerator;

    public PalindromeCreator(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public String createFor(int numberOfLetters, int numberOfUniqueLetters, int minLetter, int maxLetter) {
        String result;
        int numberOfLettersOneSide;
        String oneSideString;
        String anotherSideString;
        if (numberOfLetters % 2 == 0) {
            numberOfLettersOneSide = numberOfLetters / 2;
            oneSideString = generateRandomTextContainingAllUniqueLetters(numberOfLettersOneSide, numberOfUniqueLetters, minLetter, maxLetter);
            anotherSideString = StringManipulations.reverseStringRecursiveMethod(oneSideString);
        } else {
            numberOfLettersOneSide = numberOfLetters / 2 + 1;
            oneSideString = generateRandomTextContainingAllUniqueLetters(numberOfLettersOneSide, numberOfUniqueLetters, minLetter, maxLetter);
            anotherSideString = StringManipulations.reverseStringRecursiveMethod(oneSideString).substring(1);
        }
        result = oneSideString.concat(anotherSideString);
        return result;
    }

    private String generateRandomTextContainingAllUniqueLetters(int numberOfLetters, int numberOfUniqueLetters, int minLetter, int maxLetter) {
        StringBuilder result = new StringBuilder();
        Set<Character> utilizedUniqueLetters = new HashSet<>();
        numberOfUniqueLetters = Math.min(numberOfUniqueLetters, numberOfLetters);
        List<Character> uniqueLetters = randomGenerator.generateRandomUniqueLetters(numberOfUniqueLetters, minLetter, maxLetter);
        int index = 0;
        while (index < numberOfLetters) {
            int randomLetterIndex = randomGenerator.drawForRange(0, uniqueLetters.size() - 1);
            char randomUniqueLetter = uniqueLetters.get(randomLetterIndex);
            utilizedUniqueLetters.add(randomUniqueLetter);
            result.append(randomUniqueLetter);
            index += checkForMissingLetters(numberOfLetters, numberOfUniqueLetters, result, utilizedUniqueLetters);
        }
        return result.toString();
    }

    /**
     * If we have more missing unique letters than draws left, we remove the last letter from result.
     * @param numberOfLetters number of letters to be generated
     * @param numberOfUniqueLetters number of unique letters generated string consists of
     * @param result string consisting of generated letters
     * @param utilizedUniqueLetters to keep track of utilized letters
     * @return 0 when we need to repeat a draw, 1 when there is no need to repeat a draw
     */
    private static int checkForMissingLetters(
        int numberOfLetters,
        int numberOfUniqueLetters,
        StringBuilder result,
        Set<Character> utilizedUniqueLetters
    ) {
        if ((numberOfUniqueLetters - utilizedUniqueLetters.size()) > numberOfLetters - result.length()) {
            int lastIndex = result.length() - 1;
            result.deleteCharAt(lastIndex);
            return 0;
        }
        return 1;
    }

}
