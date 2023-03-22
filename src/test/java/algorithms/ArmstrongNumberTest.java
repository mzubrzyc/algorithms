package algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ArmstrongNumberTest {

    @Test
    void check() {
        // given
        List<Integer> inputNumbers = List.of(0, 1, 153, 370, 371, 407);
        List<Boolean> answers = List.of(true, true, true, true, true, true);
        // expect:
        for (int i = 0; i < inputNumbers.size(); i++) {
            assertThat(ArmstrongNumber.check(inputNumbers.get(i))).isEqualTo(answers.get(i));
        }
    }

}