package stringops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class LongestPalindromicSubstringTest {

  private LongestPalindromicSubstring longestPalindromicSubstring =
      new LongestPalindromicSubstring();

  @Test
  public void lengthOfOneReturnsThatChar() {

    assertThat(longestPalindromicSubstring.longestPalindrome("a"), equalTo("a"));
  }

  @Test
  public void lengthOfTwoWithSameCharsReturnsThatString() {

    assertThat(longestPalindromicSubstring.longestPalindrome("aa"), equalTo("aa"));
  }

  @Test
  public void lengthOfThreeWithAPalindromeOfTwo() {

    assertThat(longestPalindromicSubstring.longestPalindrome("bba"), equalTo("bb"));
  }

  @Test
  public void lengthOfFour() {

    assertThat(longestPalindromicSubstring.longestPalindrome("abac"), equalTo("aba"));
  }

  @Test
  public void veryLongPalindrome() {

    String longPalindromeContainingString =
        "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";

    assertThat(
        longestPalindromicSubstring.longestPalindrome(longPalindromeContainingString),
        equalTo("fklkf"));
  }
}
