package algorithms;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RemoveDuplicates {

    /**
     * <a href="https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html?source=post_page---------------------------&ref=hackernoon.com#axzz7xnnavhVj">link</a>
     */
    public int[] fromArray(int[] arrayWithDuplicates) {
        Arrays.sort(arrayWithDuplicates);
        int[] result = new int[arrayWithDuplicates.length];
        int previous = arrayWithDuplicates[0];
        result[0] = previous;
        for (int i = 0; i < arrayWithDuplicates.length; i++) {
            int arrayWithDuplicatesElement = arrayWithDuplicates[i];
            if (previous != arrayWithDuplicatesElement) {
                result[i] = arrayWithDuplicatesElement;
            }
            previous = arrayWithDuplicatesElement;
        }
        return result;
    }

}
