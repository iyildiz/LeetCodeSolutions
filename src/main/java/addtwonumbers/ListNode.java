package addtwonumbers;

public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    if (x < 10) {
      val = x;
      next = null;
    } else {
      val = x % 10;
      next = new ListNode(x / 10);
    }
  }

  @Override
  public String toString() {

    return next == null ? val + "" : next.toString() + "" + val;
  }
}
