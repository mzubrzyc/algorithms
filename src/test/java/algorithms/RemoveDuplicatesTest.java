package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void fromArray() {
        Assertions.assertThat(RemoveDuplicates.fromArray(new int[] {1, 1, 2, 2, 3})).isEqualTo(new int[] {1, 0, 2, 0, 3});
        Assertions.assertThat(RemoveDuplicates.fromArray(new int[] {1, 1, 2, 2, 3, 3, 3})).isEqualTo(new int[] {1, 0, 2, 0, 3, 0, 0});
        Assertions.assertThat(RemoveDuplicates.fromArray(new int[] {4, 2, 1, 1, 2, 2, 3, 3, 3})).isEqualTo(new int[] {1, 0, 2, 0, 0, 3, 0, 0, 4});
    }
}