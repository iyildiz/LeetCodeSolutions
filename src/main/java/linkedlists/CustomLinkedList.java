package linkedlists;

import java.util.ArrayList;

public class CustomLinkedList {
    public int value;
    public CustomLinkedList next;

    public CustomLinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public CustomLinkedList middleNode(CustomLinkedList linkedList) {

        var listOfNodes = new ArrayList<CustomLinkedList>();

        var index = 0;
        for(CustomLinkedList current = linkedList; current != null; current = current.next) {
            listOfNodes.add(current);
            index++;
        }

        return index % 2 == 0
            ? listOfNodes.get(index/2)
            : listOfNodes.get((index+1)/2 -1);
    }

    public CustomLinkedList removeDuplicates(CustomLinkedList linkedList) {

        var current = linkedList;
        while(current!=null && current.next != null) {
            if(current.value == current.next.value) {
                // Remove the next node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return linkedList;
    }
}
