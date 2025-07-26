package linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleNodeTest {
  @Test
  void middleNode() {

      var linkedList = new CustomLinkedList(2);
        linkedList.next = new CustomLinkedList(7);
        linkedList.next.next = new CustomLinkedList(3);
        linkedList.next.next.next = new CustomLinkedList(5);

        var middleNode = linkedList.middleNode(linkedList);
        assertThat(middleNode.value).isEqualTo(3);
  }
}
