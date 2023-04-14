package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissingNumberFinderTest {

    @Test
    void find() {
        assertThat(MissingNumberFinder.find(new int[]{1, 3, 7, 6, 2}, 7)).containsExactly(4, 5);
        assertThat(MissingNumberFinder.find(new int[]{3, 7, 6, 2}, 7)).containsExactly(1, 4, 5);
        assertThat(MissingNumberFinder.find(new int[]{3, 6, 2}, 7)).containsExactly(1, 4, 5, 7);
    }
}