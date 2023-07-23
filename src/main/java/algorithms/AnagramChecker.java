package algorithms;

import java.util.Arrays;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

/**
 * <a href="https://en.wikipedia.org/wiki/Anagram">wiki</a>
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
@UtilityClass
public class AnagramChecker {

    public boolean isAnagramByIteration(@NonNull String word, @NonNull String anagram) {
        char[] wordChars = word.toCharArray();
        StringBuilder sbAnagram = new StringBuilder(anagram);
        if (checkForLengthAndEmptiness(word, anagram)) {
            return false;
        }
        for (char c : wordChars) {
            int index = sbAnagram.indexOf(String.valueOf(c));
            if (index != -1) {
                sbAnagram.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramBySort(@NonNull String word, @NonNull String anagram) {
        if (checkForLengthAndEmptiness(word, anagram)) {return false;}
        char[] a1 = word.toCharArray();
        char[] a2 = anagram.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    private static boolean checkForLengthAndEmptiness(String word, String anagram) {
        return word.isEmpty() || word.length() != anagram.length();
    }

}
