package algorithms;

import lombok.experimental.UtilityClass;

import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
