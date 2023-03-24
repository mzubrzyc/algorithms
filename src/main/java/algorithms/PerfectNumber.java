package algorithms;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@UtilityClass
public class PerfectNumber {

    public boolean isPerfect(int number) {
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public List<Integer> findInRange(int beginning, int end) {
        return IntStream.range(beginning, end + 1)
                .filter(PerfectNumber::isPerfect)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

}
