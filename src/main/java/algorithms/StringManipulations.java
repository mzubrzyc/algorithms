package algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringManipulations {

    public String reverseStringRecursiveMethod(String value) {
        return reverseRecursive(value);
    }

    public String reverseStringIterativeMethod(String value) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            stringBuilder.append(value.charAt(i));
        }
        return stringBuilder.toString();
    }

    private static String reverseRecursive(String value) {
        if (value.length() == 1) {
            return value;
        }
        return reverseRecursive(value.substring(1)) + value.charAt(0);
    }

}
