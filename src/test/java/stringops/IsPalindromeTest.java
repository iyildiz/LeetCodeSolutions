package stringops;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IsPalindromeTest {

    @Test
    void isPalindromeReturnsExpectedResult() {
        assertThat(isPalindrome("abcdcba")).isTrue();
        assertThat(isPalindrome2("abcdcba")).isTrue();
        assertThat(isPalindrome3("abcdcba")).isTrue();
    }

    private boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    private boolean isPalindrome2(String str) {
        var startIndex = 0;
        var endIndex = str.length() - 1;

        while (startIndex < endIndex) {
            if (str.charAt(startIndex) != str.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }

    private boolean isPalindrome3(String str) {

        if(str.isEmpty() || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome3(str.substring(1, str.length() - 1));
        }

        return false;
    }

}
