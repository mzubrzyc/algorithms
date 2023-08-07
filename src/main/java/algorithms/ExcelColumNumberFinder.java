package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ExcelColumNumberFinder {

    public long fromTitle(String title) {
        long result = 0;
        for (char ch : title.toCharArray()) {
            int singleCharacterColumnNumber = ch - 'A' + 1;
            result = result * 26 + singleCharacterColumnNumber;
        }
        return result;
    }

}
