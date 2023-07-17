package algorithms;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RemoveDuplicates {

    /**
     * <a href="https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html?source=post_page---------------------------&ref=hackernoon.com#axzz7xnnavhVj">link</a>
     * <br>
     * Compare next element to the previous one and if it is unique put it into a table without duplicates.
     * @param arrayWithDuplicates int array we are removing duplicate elements from.
     */
    public int[] fromArray(int[] arrayWithDuplicates) {
        Arrays.sort(arrayWithDuplicates);
        int[] resultWithoutDuplicates = new int[arrayWithDuplicates.length];
        int previous = arrayWithDuplicates[0];
        resultWithoutDuplicates[0] = previous;
        for (int i = 1; i < arrayWithDuplicates.length; i++) {
            int arrayWithDuplicatesElement = arrayWithDuplicates[i];
            if (previous != arrayWithDuplicatesElement) {
                resultWithoutDuplicates[i] = arrayWithDuplicatesElement;
            }
            previous = arrayWithDuplicatesElement;
        }
        return resultWithoutDuplicates;
    }

}
