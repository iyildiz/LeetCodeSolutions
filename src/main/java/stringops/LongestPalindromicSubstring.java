package stringops;

public class LongestPalindromicSubstring {

  public String longestPalindrome(String str) {

    String currentLongestPalindromeSubString = "";

    for (int startIndex = 0; startIndex < str.length(); startIndex++) {
      for (int endIndex = startIndex + 1; endIndex <= str.length(); endIndex++) {
        String subString = str.substring(startIndex, endIndex);
        if (isShorterThan(currentLongestPalindromeSubString, subString)
            && isPalindrome(subString)) {
          currentLongestPalindromeSubString = subString;
        }
      }
    }

    return currentLongestPalindromeSubString;
  }

  private boolean isShorterThan(String firstString, String secondString) {
    return firstString.length() < secondString.length();
  }

  private boolean isPalindrome(String str) {

    final StringBuilder reverseOfString = new StringBuilder(str).reverse();
    return str.equals(reverseOfString.toString());
  }
}
