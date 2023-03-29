package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExcelColumNumberFinderTest {

    @Test
    void fromTitle() {
        assertThat(ExcelColumNumberFinder.fromTitle("A")).isEqualTo(1L);
        assertThat(ExcelColumNumberFinder.fromTitle("Z")).isEqualTo(26L);
        assertThat(ExcelColumNumberFinder.fromTitle("ABC")).isEqualTo(731L);
        assertThat(ExcelColumNumberFinder.fromTitle("CDA")).isEqualTo(2133L);
        assertThat(ExcelColumNumberFinder.fromTitle("CODEWARS")).isEqualTo(28779382963L);
    }
}