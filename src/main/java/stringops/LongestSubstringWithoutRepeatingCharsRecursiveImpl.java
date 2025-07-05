package stringops;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharsRecursiveImpl {

  public int lengthOfLongestSubstring(String s) {

    if (s.equals("")) {
      return 0;
    }

    int maxLength = 0;
    for (int i = 0; i < s.length(); i++) {
      int lengthOfLongestSubStringStartingFromElement =
          findLengthOfLongestSubStringAtTheBeginningOfString(s.substring(i));
      if (maxLength < lengthOfLongestSubStringStartingFromElement) {
        maxLength = lengthOfLongestSubStringStartingFromElement;
      }
    }

    return maxLength;
  }

  private int findLengthOfLongestSubStringAtTheBeginningOfString(String s) {
    Set<Character> charsInString = new HashSet<>();

    StringBuilder firstSubstringWithoutRepeatingChars = new StringBuilder();
    for (Character ch : s.toCharArray()) {
      if (charsInString.contains(ch)) {
        break;
      }

      firstSubstringWithoutRepeatingChars.append(ch);
      charsInString.add(ch);
    }

    return firstSubstringWithoutRepeatingChars.length();
  }
}
