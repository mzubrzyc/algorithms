package algorithms;

import java.util.stream.IntStream;
import lombok.experimental.UtilityClass;

/**
 * Source: "Robert Sedgewick Kevin Wayne - Algorithms - 4th edition"<br>
 * Index is a site for an integer component identifier<br>
 * union() - merges two components if the two sites are in different components<br>
 * find() - returns an integer component identifier for a given site<br>
 * union() - merges two different components decrements the number of components by one<br>
 * inst[] id - parent link (site indexed)<br>
 * int[] size - size of component for roots (site indexed)<br>
 * int count - number of components<br>
 * */
@UtilityClass
public class DynamicConnectivity {

    private static void validateIndex(int siteIndex, int size) {
        if (siteIndex < 0 || siteIndex >= size) {
            throw new IllegalArgumentException("Index is not between 0 and " + (size - 1));
        }
    }

    class QuickFind {

        private final int[] id;

        private int count;
        public QuickFind(int size) {
            this.id = IntStream.range(0, size).toArray();
            this.count = size;
        }

        public int count() {
            return count;
        }

        private int find(int siteIndex) {
            validateIndex(siteIndex, id.length);
            return id[siteIndex];
        }

        public boolean connected(int siteIndexA, int siteIndexB) {
            return find(siteIndexA) == find(siteIndexB);
        }

        public void union(int siteIndexA, int siteIndexB) {
            int componentValueA = find(siteIndexA);
            int componentValueB = find(siteIndexB);
            if (componentValueA == componentValueB) {
                return;
            }
            for (int i = 0; i < id.length; i++) {
                if (id[i] == componentValueA) {
                    id[i] = componentValueB;
                }
            }
            count--;
        }

    }
/**
 * Is faster than the quick-find algorithm, because it does not have to go through the entire array for each input pair.
 * */
    class QuickUnion {

        private final int[] id;
        private int count;

        public QuickUnion(int size) {
            this.id = IntStream.range(0, size).toArray();
            this.count = id.length;
        }

        public int count() {
            return count;
        }

        public boolean connected(int siteIndexA, int siteIndexB) {
            return find(siteIndexA) == find(siteIndexB);
        }

        private int find(int siteIndex) {
            validateIndex(siteIndex, id.length);
            int rootSiteIndex = siteIndex;
            while (rootSiteIndex != id[rootSiteIndex]) {
                rootSiteIndex = id[rootSiteIndex];
            }
            return rootSiteIndex;
        }

        public void union(int siteIndexA, int siteIndexB) {
            int rootSiteIndexA = find(siteIndexA);
            int rootSiteIndexB = find(siteIndexB);
            if (rootSiteIndexA == rootSiteIndexB) {
                return;
            }
            id[rootSiteIndexA] = rootSiteIndexB;
            count--;
        }

    }

    class WeightedQuickUnion {

        private final int[] id;
        private final int[] size;
        private int count;

        public WeightedQuickUnion(int size) {
            this.id = IntStream.range(0, size).toArray();
            this.size = IntStream.range(0, size).map(i -> 1).toArray();
            this.count = id.length;
        }

        public int count() {
            return count;
        }

        public boolean connected(int siteIndexA, int siteIndexB) {
            return find(siteIndexA) == find(siteIndexB);
        }

        private int find(int siteIndex) {
            validateIndex(siteIndex, id.length);
            int rootSiteIndex = siteIndex;
            while (rootSiteIndex != id[rootSiteIndex]) {
                rootSiteIndex = id[rootSiteIndex];
            }
            return rootSiteIndex;
        }

        public void union(int siteIndexA, int siteIndexB) {
            int rootSiteIndexA = find(siteIndexA);
            int rootSiteIndexB = find(siteIndexB);
            if (rootSiteIndexA == rootSiteIndexB) {
                return;
            }
            if (size[rootSiteIndexA] < size[rootSiteIndexB]) {
                id[rootSiteIndexA] = rootSiteIndexB;
                size[rootSiteIndexB] += size[rootSiteIndexA];
            } else {
                id[rootSiteIndexB] = rootSiteIndexA;
                size[rootSiteIndexA] += size[rootSiteIndexB];
            }
            count--;
        }

    }


}
