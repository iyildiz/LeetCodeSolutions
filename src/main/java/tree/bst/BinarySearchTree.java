package tree.bst;

public class BinarySearchTree {

    public int value;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public int findClosestValueInBst(int target) {

        if(value  == target) {
            return value;
        }

        Integer closestInTheSubtree = null;
        if(target < value && left != null) {
            closestInTheSubtree = left.findClosestValueInBst(target);
        }
        if(target > value && right!= null) {
            closestInTheSubtree = right.findClosestValueInBst(target);
        }

        if(closestInTheSubtree == null) {
            return value;
        }

        return Math.abs(closestInTheSubtree - target) < Math.abs(value - target) ? closestInTheSubtree : value;
    }
}
