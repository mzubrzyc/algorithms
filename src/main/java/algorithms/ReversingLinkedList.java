package algorithms;

import lombok.Data;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ReversingLinkedList {

    public Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        return previous;
    }

    public Node reverseRecursively(Node head) {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            return head;
        }
        Node nextElement = reverseRecursively(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return nextElement;
    }

    @Data
    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

    }

}
