package algorithms;

import java.util.HashSet;
import java.util.Set;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LongestSubstringWithoutRepeating {

    public int calculate(String inputLetters) {
        Set<Character> tempChars = new HashSet<>();
        int maxUniqueLen = 0;
        int i = 0;
        int j = 0;
        while(j < inputLetters.length()) {
            if (!tempChars.contains(inputLetters.charAt(j))) {
                tempChars.add(inputLetters.charAt(j++));
            } else {
                tempChars.remove(inputLetters.charAt(i++));
            }
            maxUniqueLen = Math.max(maxUniqueLen, tempChars.size());
        }
        return maxUniqueLen;
    }

}
