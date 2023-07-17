package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstNonRepeatedCharacterTest {

    @Test
    @SneakyThrows
    void get() {
        assertThat(FirstNonRepeatedCharacter.get("khjsdfkhi")).isEqualTo('j');
        assertThat(FirstNonRepeatedCharacter.get("hello")).isEqualTo('h');
        Assertions.assertThatThrownBy(() -> FirstNonRepeatedCharacter.get("abcdabcd"))
            .isInstanceOf(FirstNonRepeatedCharacter.LetterNotFoundException.class);
    }

    @Test
    @SneakyThrows
    void getByApproachTwo() {
        assertThat(FirstNonRepeatedCharacter.getUsingStream("khjsdfkhi")).isEqualTo('j');
        assertThat(FirstNonRepeatedCharacter.getUsingStream("hello")).isEqualTo('h');
        Assertions.assertThatThrownBy(() -> FirstNonRepeatedCharacter.getUsingStream("abcdabcd"))
                  .isInstanceOf(FirstNonRepeatedCharacter.LetterNotFoundException.class);
    }
}