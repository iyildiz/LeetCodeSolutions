package numbers;

public class ReverseInteger {
  public int reverse(int number) {

    String reversedNumberAsString = reverseNumberAsString(number);
    return convertStringToInteger(reversedNumberAsString);
  }

  private int convertStringToInteger(String reversedNumberAsString) {
    try {
      return Integer.valueOf(reversedNumberAsString);
    } catch (NumberFormatException ex) {
      return 0;
    }
  }

  private String reverseNumberAsString(int number) {

    String reverse = new StringBuilder(String.valueOf(number)).reverse().toString();
    if (number < 0) {
      return bringDashCharAtTheEndToStart(reverse);
    } else {
      return reverse;
    }
  }

  private String bringDashCharAtTheEndToStart(String reverse) {
    return "-" + reverse.substring(0, reverse.length() - 1);
  }
}
