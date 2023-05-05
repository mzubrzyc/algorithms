package algorithms;

import static algorithms.PairsFinder.Pair;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class PairsFinderTest {

    @Test
    void findWhenSumIsGivenNumber() {
        int[] input = new int[] {1, 6, 5, 2, 8, 4, 7, 0, -5, 12};
        int number = 7;
        List<Pair> pairs = PairsFinder.findWhenSumIsGivenNumber(input, number);
        assertThat(pairs)
            .containsExactly(
                new Pair(6, 1),
                new Pair(2, 5),
                new Pair(0, 7),
                new Pair(12, -5)
            );
    }
}