package algorithms;

import java.util.HashSet;
import java.util.Set;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LongestSubstringWithoutRepeating {

    public int calculate(String inputLetters) {
        Set<Character> tempCharsSet = new HashSet<>();
        int maxUniqueLen = 0;
        int i = 0;
        int j = 0;
        while(j < inputLetters.length()) {
            if (!tempCharsSet.contains(inputLetters.charAt(j))) {
                tempCharsSet.add(inputLetters.charAt(j++));
                maxUniqueLen = Math.max(maxUniqueLen, tempCharsSet.size());
            } else {
                tempCharsSet.remove(inputLetters.charAt(i++));
            }
        }
        return maxUniqueLen;
    }

}
