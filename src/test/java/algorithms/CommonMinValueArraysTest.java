package algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CommonMinValueArraysTest {

    @Test
    void find() {
        assertThat(
            CommonMinValueArrays.find(
                new int[] {1, 5, 8},
                new int[] {20, 15, 10, 9, 8}
            )
        ).isEqualTo(8);
        assertThat(
            CommonMinValueArrays.find(
                new int[] {1, 5, 8},
                new int[] {20, 15, 13, 12, 9}
            )
        ).isEqualTo(-1);
        assertThat(
            CommonMinValueArrays.find(
                new int[] {1, 5, 8, 10, 20},
                new int[] {6, 4, 40, 9}
            )
        ).isEqualTo(-1);
    }

    @Test
    void findVer2() {
        assertThat(
            CommonMinValueArrays.findVer2(
                new int[] {1, 5, 8},
                new int[] {20, 15, 10, 9, 8}
            )
        ).isEqualTo(8);
        assertThat(
            CommonMinValueArrays.findVer2(
                new int[] {1, 5, 8},
                new int[] {20, 15, 13, 12, 9}
            )
        ).isEqualTo(-1);
        assertThat(
            CommonMinValueArrays.findVer2(
                new int[] {1, 5, 8, 10, 20},
                new int[] {6, 4, 40, 9}
            )
        ).isEqualTo(-1);
    }

}