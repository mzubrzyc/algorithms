package algorithms;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsNumberPowerOfTwoTest {

    @Test
    @SneakyThrows
    void check() {
        assertThat(IsNumberPowerOfTwo.check(1)).isTrue();
        assertThat(IsNumberPowerOfTwo.check(7)).isFalse();
        assertThat(IsNumberPowerOfTwo.check(6)).isFalse();
        assertThat(IsNumberPowerOfTwo.check(8)).isTrue();
        assertThat(IsNumberPowerOfTwo.check(12)).isFalse();
        assertThat(IsNumberPowerOfTwo.check(16)).isTrue();
        assertThat(IsNumberPowerOfTwo.check(127)).isFalse();
        assertThat(IsNumberPowerOfTwo.check(128)).isTrue();
    }

    @Test
    @SneakyThrows
    void check2() {
        assertThat(IsNumberPowerOfTwo.check2(1)).isTrue();
        assertThat(IsNumberPowerOfTwo.check2(7)).isFalse();
        assertThat(IsNumberPowerOfTwo.check2(6)).isFalse();
        assertThat(IsNumberPowerOfTwo.check2(8)).isTrue();
        assertThat(IsNumberPowerOfTwo.check2(12)).isFalse();
        assertThat(IsNumberPowerOfTwo.check2(16)).isTrue();
        assertThat(IsNumberPowerOfTwo.check2(127)).isFalse();
        assertThat(IsNumberPowerOfTwo.check2(128)).isTrue();
    }

    @Test
    @SneakyThrows
    void check3() {
        assertThat(IsNumberPowerOfTwo.check3(1)).isTrue();
        assertThat(IsNumberPowerOfTwo.check3(7)).isFalse();
        assertThat(IsNumberPowerOfTwo.check3(6)).isFalse();
        assertThat(IsNumberPowerOfTwo.check3(8)).isTrue();
        assertThat(IsNumberPowerOfTwo.check3(12)).isFalse();
        assertThat(IsNumberPowerOfTwo.check3(16)).isTrue();
        assertThat(IsNumberPowerOfTwo.check3(127)).isFalse();
        assertThat(IsNumberPowerOfTwo.check3(128)).isTrue();
    }
}