package algorithms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class DynamicConnectivityTest {

    private final int SIZE = 10;
    private final DynamicConnectivity.QuickFind quickFind = new DynamicConnectivity.QuickFind(SIZE);
    private final DynamicConnectivity.QuickUnion quickUnion = new DynamicConnectivity.QuickUnion(SIZE);
    private final DynamicConnectivity.WeightedQuickUnion weightedQuickUnion = new DynamicConnectivity.WeightedQuickUnion(SIZE);

    @Test
    void quickFind(){
        assertThatThrownBy(() -> quickUnion.union(-1, 2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Index is not between 0 and " + (SIZE - 1));
        quickFind.union(1, 2);
        quickFind.union(3, 4);
        quickFind.union(5, 6);
        quickFind.union(1, 6);
        quickFind.union(9, 2);
        quickFind.union(8, 2);
        quickFind.union(7, 8);
        assertThat(quickFind.connected(1, 2)).isTrue();
        assertThat(quickFind.connected(3, 4)).isTrue();
        assertThat(quickFind.connected(5, 6)).isTrue();
        assertThat(quickFind.connected(1, 6)).isTrue();
        assertThat(quickFind.connected(9, 2)).isTrue();
        assertThat(quickFind.connected(9, 8)).isTrue();
        assertThat(quickFind.connected(1, 9)).isTrue();
        assertThat(quickFind.count()).isEqualTo(3);
    }

    @Test
    void quicUnion() {
        assertThatThrownBy(() -> quickUnion.union(-1, 2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Index is not between 0 and " + (SIZE - 1));
        quickUnion.union(1, 2);
        quickUnion.union(0, 1);
        quickUnion.union(3, 4);
        quickUnion.union(5, 6);
        quickUnion.union(1, 6);
        quickUnion.union(9, 2);
        quickUnion.union(8, 2);
        quickUnion.union(7, 8);
        /*
         *       4         _ _6_ _
         *       |        / / | \ \
         *       3      2  5  7  8  9
         *             / \
         *            0   1
         * */
        assertThat(quickUnion.connected(1, 2)).isTrue();
        assertThat(quickUnion.connected(1, 0)).isTrue();
        assertThat(quickUnion.connected(3, 4)).isTrue();
        assertThat(quickUnion.connected(5, 6)).isTrue();
        assertThat(quickUnion.connected(1, 6)).isTrue();
        assertThat(quickUnion.connected(9, 2)).isTrue();
        assertThat(quickUnion.connected(9, 8)).isTrue();
        assertThat(quickUnion.connected(1, 9)).isTrue();
        assertThat(quickUnion.count()).isEqualTo(2);
    }

    @Test
    void WeightedQuickUnion() {
        assertThatThrownBy(() -> quickUnion.union(-1, 2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Index is not between 0 and " + (SIZE - 1));
        weightedQuickUnion.union(4, 3);
        weightedQuickUnion.union(3, 8);
        weightedQuickUnion.union(6, 5);
        weightedQuickUnion.union(9, 4);
        weightedQuickUnion.union(2, 1);
        weightedQuickUnion.union(8, 9);
        weightedQuickUnion.union(5, 0);
        weightedQuickUnion.union(7, 2);
        weightedQuickUnion.union(6, 1);
        weightedQuickUnion.union(1, 0);
        weightedQuickUnion.union(6, 7);
        /*
        *    4              6
        *  / | \          / | \
        * 3  8  9        0  2  5
        *                  / \
        *                 1   7
        * */
        assertThat(weightedQuickUnion.connected(4, 3)).isTrue();
        assertThat(weightedQuickUnion.connected(3, 8)).isTrue();
        assertThat(weightedQuickUnion.connected(6, 5)).isTrue();
        assertThat(weightedQuickUnion.connected(9, 4)).isTrue();
        assertThat(weightedQuickUnion.connected(2, 1)).isTrue();
        assertThat(weightedQuickUnion.connected(8, 9)).isTrue();
        assertThat(weightedQuickUnion.connected(5, 0)).isTrue();
        assertThat(weightedQuickUnion.connected(7, 2)).isTrue();
        assertThat(weightedQuickUnion.connected(6, 1)).isTrue();
        assertThat(weightedQuickUnion.connected(1, 0)).isTrue();
        assertThat(weightedQuickUnion.connected(6, 7)).isTrue();
        assertThat(weightedQuickUnion.count()).isEqualTo(2);
    }


}