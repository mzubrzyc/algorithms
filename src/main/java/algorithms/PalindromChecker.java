package algorithms;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PalindromChecker {

    public boolean isAnagram(@NonNull String word, @NonNull String anagram) {
        char[] wordChars = word.toCharArray();
        StringBuilder sbAnagram = new StringBuilder(anagram);
        if (word.isEmpty() || word.length() != anagram.length()) {
            return false;
        }
        for (char c : wordChars) {
            int index = sbAnagram.indexOf(String.valueOf(c));
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String sequence) {
        return StringManipulations.reverseStringRecursiveMethod(sequence).equalsIgnoreCase(sequence);
    }

}
