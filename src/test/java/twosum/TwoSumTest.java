package twosum;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void solutionNumbersAtTheStartOfTheList(){

        int [] numbers  =  {2, 7, 11, 15};
        int target = 9;
        int [] indexOfNumbersAddUptoSum = twoSum.twoSum(numbers, target);

        assertIndexes(indexOfNumbersAddUptoSum,1,2);
    }

    @Test
    public void solutionNumbersAtTheEndOfTheList(){

        int [] numbers  =  {2, 7, 11, 15};
        int target = 26;

        int [] indexOfNumbersAddUptoSum = twoSum.twoSum(numbers, target);
        assertIndexes(indexOfNumbersAddUptoSum, 3, 4);
    }

    private void assertIndexes(int[] indexOfNumbersAddUptoSum, int expectedFirstIndex, int expectedSecondIndex) {

        assertThat(indexOfNumbersAddUptoSum[0], equalTo(expectedFirstIndex));
        assertThat(indexOfNumbersAddUptoSum[1], equalTo(expectedSecondIndex));
        assertThat(indexOfNumbersAddUptoSum[0] < indexOfNumbersAddUptoSum[1], equalTo(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void noSolutionReturnsThrowsException(){

        int [] numbers  =  {2, 7, 11, 15};
        int target = 0;

        twoSum.twoSum(numbers, target);
    }

    @Test
    public void solutionWithVeryLongList(){

        IntStream numbers  = IntStream.rangeClosed(1,10000000);

        int target = 19999999;

        int [] indexOfNumbersAddUptoSum = twoSum.twoSum(numbers.toArray(), target);
        assertIndexes(indexOfNumbersAddUptoSum, 9999999,10000000);
    }


}
