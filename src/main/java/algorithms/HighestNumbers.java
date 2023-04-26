package algorithms;

import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HighestNumbers {

    public List<Integer> returnTopTwoHighestNumbers(List<Integer> numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (max1 < number) {
                max2 = max1;
                max1 = number;
            } else if (max2 < number) {
                max2 = number;
            }
        }
        return List.of(max1, max2);
    }

}
