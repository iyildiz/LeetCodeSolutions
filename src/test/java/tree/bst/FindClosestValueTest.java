package tree.bst;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindClosestValueTest {
  @Test
  void findClosestValueInBst() {

    var bst = new BinarySearchTree(10);
    bst.left = new BinarySearchTree(5);
    bst.right = new BinarySearchTree(15);
    bst.left.left = new BinarySearchTree(2);
    bst.left.right = new BinarySearchTree(5);
    bst.right.right = new BinarySearchTree(22);
    bst.right.left = new BinarySearchTree(13);
    bst.left.left.left = new BinarySearchTree(1);
    bst.right.left.right = new BinarySearchTree(14);


    var target = 12;
    var expectedClosestValue = 13;

    int closestValue = bst.findClosestValueInBst(target);
    assertThat(closestValue).isEqualTo(expectedClosestValue);
  }
}
