package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryConverterTest {

    @Test
    void convertToBinary() {
        assertThat(BinaryConverter.convertToBinary("T", "US-ASCII")).isEqualTo("01010100");
        assertThat(BinaryConverter.convertToBinary("語", "Big5")).isEqualTo("10111011 01111001");
        assertThat(BinaryConverter.convertToBinary("T", "UTF-32")).isEqualTo("00000000 00000000 00000000 01010100");
        assertThat(BinaryConverter.convertToBinary("T", "UTF-8")).isEqualTo("01010100");
        assertThat(BinaryConverter.convertToBinary("語", "UTF-8")).isEqualTo("11101000 10101010 10011110");
    }
}