package linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicatesTest {

  @Test
  void removeDuplicatesFromLinkedList() {

      // Add following nodes: 1 -> 1 > 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6
      var linkedList = new CustomLinkedList(1);
        linkedList.next = new CustomLinkedList(1);
        linkedList.next.next = new CustomLinkedList(3);
        linkedList.next.next.next = new CustomLinkedList(4);
        linkedList.next.next.next.next = new CustomLinkedList(4);
        linkedList.next.next.next.next.next = new CustomLinkedList(4);
        linkedList.next.next.next.next.next.next = new CustomLinkedList(5);
        linkedList.next.next.next.next.next.next.next = new CustomLinkedList(6);
        linkedList.next.next.next.next.next.next.next.next = new CustomLinkedList(6);

        var linkedListWithNoDuplicates = linkedList.removeDuplicates(linkedList);

        assertThat(linkedListWithNoDuplicates.value).isEqualTo(1);
        assertThat(linkedListWithNoDuplicates.next.value).isEqualTo(3);
        assertThat(linkedListWithNoDuplicates.next.next.value).isEqualTo(4);
        assertThat(linkedListWithNoDuplicates.next.next.next.value).isEqualTo(5);
        assertThat(linkedListWithNoDuplicates.next.next.next.next.value).isEqualTo(6);
  }
}
