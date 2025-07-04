package addtwonumbers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class AddTwoNumbersTest {

  @Test
  public void twoNumbersSumSmallerThanTen() {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    ListNode number1 = new ListNode(3);
    ListNode number2 = new ListNode(5);

    ListNode sumOfNumbers = addTwoNumbers.addTwoNumbers(number1, number2);
    assertThat(sumOfNumbers.toString(), equalTo("8"));
  }

  @Test
  public void twoNumbersSumGreaterThanTen() {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    ListNode number1 = new ListNode(9);
    ListNode number2 = new ListNode(5);

    ListNode sumOfNumbers = addTwoNumbers.addTwoNumbers(number1, number2);
    assertThat(sumOfNumbers.toString(), equalTo("14"));
  }

  @Test
  public void twoThreeDigitNumbers() {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    ListNode number1 = new ListNode(342);
    ListNode number2 = new ListNode(465);

    ListNode sumOfNumbers = addTwoNumbers.addTwoNumbers(number1, number2);
    assertThat(sumOfNumbers.toString(), equalTo("807"));
  }
}
