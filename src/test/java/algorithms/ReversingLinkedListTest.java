package algorithms;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static algorithms.ReversingLinkedList.Node;
import static org.assertj.core.api.Assertions.assertThat;

class ReversingLinkedListTest {

    @Test
    void reverse() {
        final int noOfIntValues = 10;
        Node generatedNodes = generateNodesList(noOfIntValues);
        assertNodes(ReversingLinkedList.reverse(generatedNodes), generateAndSortInverseForNumber(noOfIntValues));
    }

    @Test
    void reverseRecursively() {
        final int noOfIntValues = 9;
        Node generatedNodes = generateNodesList(noOfIntValues);
        assertNodes(ReversingLinkedList.reverseRecursively(generatedNodes), generateAndSortInverseForNumber(noOfIntValues));
    }

    private void assertNodes(Node node, int[] answers) {
        for (int i : answers) {
            assertThat(node).extracting(Node::getValue).isEqualTo(i);
            node = node.getNext();
        }
    }

    private int[] generateAndSortInverseForNumber(int n) {
        return IntStream.range(1, n + 1)
                .map(i -> -i)
                .sorted()
                .map(i -> -i)
                .toArray();
    }

    private Node generateNodesList(int n) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            Node node = new Node(i + 1);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        return head;
    }
}