package algorithms;

import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BinaryConverter {

    public static String convertToBinary(String input, String encoding) {
        byte[] encodedInput = Charset.forName(encoding)
                                     .encode(input)
                                     .array();
        return IntStream.range(0, encodedInput.length)
                        .map(i -> encodedInput[i])
                        .mapToObj(it -> String.format("%8s", Integer.toBinaryString(it & 0xFF)).replace(' ', '0'))
                        .collect(Collectors.joining(" "));
    }

}
