package algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class ListMiddleElementFinderTest {

    @Test
    void findMiddleElementOfListInOnePass() {
        // given
        final int RANGE_TO_EXPLICIT = 6;
        LinkedList<String> inputLinkedList =
                IntStream.range(1, RANGE_TO_EXPLICIT)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.toCollection(LinkedList::new));
        log.info("Input linkedList: " + inputLinkedList);
        // when
        List<String> middleElementOfLinkedListInOnePass =
                ListMiddleElementFinder.findMiddleElementOfListInOnePass(inputLinkedList);
        // then
        assertThat(middleElementOfLinkedListInOnePass).contains("3");


    }
}