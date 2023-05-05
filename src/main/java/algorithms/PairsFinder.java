package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PairsFinder {

    /**
     * Finds pairs of int numbers of an array which sum is equal to a given number.
     *
     * @param array  we are looking for pairs in.
     * @param number which value should be given when adding int numbers in pairs.
     */
    public List<Pair> findWhenSumIsGivenNumber(int[] array, int number) {
        List<Pair> result = new ArrayList<>();

        if (array.length < 2) {
            return result;
        }

        Set<Integer> valueChecker = new HashSet<>(array.length);
        int complement;

        for (int value : array) {
            complement = number - value;
            if (!valueChecker.contains(complement)) {
                valueChecker.add(value);
            } else {
                result.add(new Pair(value, complement));
            }
        }

        return result;
    }

    record Pair(int one, int two) {
    }

}
