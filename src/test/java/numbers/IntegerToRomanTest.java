package numbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IntegerToRomanTest {

    IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    public void oneTwoThree(){

        assertThat(integerToRoman.intToRoman(1), equalTo("I"));
        assertThat(integerToRoman.intToRoman(2), equalTo("II"));
        assertThat(integerToRoman.intToRoman(3), equalTo("III"));
    }

    @Test
    public void fourFiveSixSevenEight(){

        assertThat(integerToRoman.intToRoman(4), equalTo("IV"));
        assertThat(integerToRoman.intToRoman(5), equalTo("V"));
        assertThat(integerToRoman.intToRoman(6), equalTo("VI"));
        assertThat(integerToRoman.intToRoman(7), equalTo("VII"));
        assertThat(integerToRoman.intToRoman(8), equalTo("VIII"));

    }

    @Test
    public void nineToEighteen(){

        assertThat(integerToRoman.intToRoman(9), equalTo("IX"));
        assertThat(integerToRoman.intToRoman(10), equalTo("X"));
        assertThat(integerToRoman.intToRoman(11), equalTo("XI"));
        assertThat(integerToRoman.intToRoman(12), equalTo("XII"));
        assertThat(integerToRoman.intToRoman(13), equalTo("XIII"));
        assertThat(integerToRoman.intToRoman(14), equalTo("XIV"));
        assertThat(integerToRoman.intToRoman(15), equalTo("XV"));
        assertThat(integerToRoman.intToRoman(16), equalTo("XVI"));
        assertThat(integerToRoman.intToRoman(17), equalTo("XVII"));
        assertThat(integerToRoman.intToRoman(18), equalTo("XVIII"));
    }

    @Test
    public void nineteenTwentyTwentyOneThirteen(){

        assertThat(integerToRoman.intToRoman(19), equalTo("XIX"));
        assertThat(integerToRoman.intToRoman(20), equalTo("XX"));
        assertThat(integerToRoman.intToRoman(21), equalTo("XXI"));
        assertThat(integerToRoman.intToRoman(30), equalTo("XXX"));
    }

    @Test
    public void fortyFiftySixty(){

        assertThat(integerToRoman.intToRoman(40), equalTo("XL"));
        assertThat(integerToRoman.intToRoman(50), equalTo("L"));
        assertThat(integerToRoman.intToRoman(60), equalTo("LX"));
        assertThat(integerToRoman.intToRoman(61), equalTo("LXI"));
    }
}
