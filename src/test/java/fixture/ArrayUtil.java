package fixture;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class ArrayUtil {

    public int[] fromListOfIntegers(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

}
