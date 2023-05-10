package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstNonRepeatedCharacterTest {

    @Test
    @SneakyThrows
    void get() {
        assertThat(FirstNonRepeatedCharacter.getByApproachOne("khjsdfkhi")).isEqualTo('j');
        assertThat(FirstNonRepeatedCharacter.getByApproachOne("hello")).isEqualTo('h');
        Assertions.assertThatThrownBy(() -> FirstNonRepeatedCharacter.getByApproachOne("abcdabcd"))
            .isInstanceOf(FirstNonRepeatedCharacter.LetterNotFoundException.class);
    }

    @Test
    @SneakyThrows
    void getByApproachTwo() {
        assertThat(FirstNonRepeatedCharacter.getByApproachTwo("khjsdfkhi")).isEqualTo('j');
        assertThat(FirstNonRepeatedCharacter.getByApproachTwo("hello")).isEqualTo('h');
        Assertions.assertThatThrownBy(() -> FirstNonRepeatedCharacter.getByApproachTwo("abcdabcd"))
                  .isInstanceOf(FirstNonRepeatedCharacter.LetterNotFoundException.class);
    }
}