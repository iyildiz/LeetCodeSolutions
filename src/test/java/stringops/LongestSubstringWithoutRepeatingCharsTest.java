package stringops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharsTest {

  private LongestSubstringWithoutRepeatingChars longestSubstring =
      new LongestSubstringWithoutRepeatingChars();

  @Test
  public void oneCharStringReturnsOne() {

    assertLongestSubstringWithoutRepeatingChars("a", 1);
  }

  @Test
  public void stringConsistingOnlyOneCharReturnsOne() {

    assertLongestSubstringWithoutRepeatingChars("aaaa", 1);
  }

  @Test
  public void onlyThreeDistinctCharsReturnsThree() {

    assertLongestSubstringWithoutRepeatingChars("abc", 3);
  }

  @Test
  public void threeDistinctCharsReturnsThree() {

    assertLongestSubstringWithoutRepeatingChars("abcabcbb", 3);
  }

  @Test
  public void aLongExampleReturnsExpectedResult() {

    assertLongestSubstringWithoutRepeatingChars(
        "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco", 12);
  }

  private void assertLongestSubstringWithoutRepeatingChars(String str, int expectedLength) {
    assertThat(longestSubstring.lengthOfLongestSubstring(str), equalTo(expectedLength));
  }
}
