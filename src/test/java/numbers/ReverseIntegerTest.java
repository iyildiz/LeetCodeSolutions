package numbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger();
    @Test
    public void lengthOfOneReturnsThatInteger(){

        assertThat(reverseInteger.reverse(5), equalTo(5));
    }


    @Test
    public void lengthOfTwo(){

        assertThat(reverseInteger.reverse(12), equalTo(21));
    }


    @Test
    public void lengthOfThree(){

        assertThat(reverseInteger.reverse(123), equalTo(321));
    }

    @Test
    public void negativeNumber(){

        assertThat(reverseInteger.reverse(-123), equalTo(-321));
    }

    @Test
    public void reverseIsBiggerThanMaxIntegerReturnsZero(){

        assertThat(reverseInteger.reverse(1534236469), equalTo(0));
    }


    @Test
    public void negativeReverseIsBiggerThanMaxIntegerReturnsZero(){

        assertThat(reverseInteger.reverse(-2147483648), equalTo(0));
    }


}
