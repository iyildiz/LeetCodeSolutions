package numbers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

  TwoSum twoSum = new TwoSum();

  @Nested
  class TwoSum1 {
    @Test
    public void solutionNumbersAtTheStartOfTheList() {

      int[] numbers = {2, 7, 11, 15};
      int target = 9;
      int[] numbersAddUptoSum = twoSum.twoSum(numbers, target);

      assertIndexes(numbersAddUptoSum, 1, 2);
    }

    @Test
    public void solutionNumbersAtTheEndOfTheList() {

      int[] numbers = {2, 7, 11, 15};
      int target = 26;

      int[] numbersAddUptoSum = twoSum.twoSum(numbers, target);
      assertIndexes(numbersAddUptoSum, 3, 4);
    }

    @Test
    public void noSolutionReturnsThrowsException() {

      int[] numbers = {2, 7, 11, 15};
      int target = 0;

      assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(numbers, target));
    }

    @Test
    public void solutionWithVeryLongList() {

      IntStream numbers = IntStream.rangeClosed(1, 10000000);

      int target = 19999999;

      int[] numbersAddUptoSum = twoSum.twoSum(numbers.toArray(), target);
      assertIndexes(numbersAddUptoSum, 9999999, 10000000);
    }
  }

  @Nested
  class TwoSum2 {

    @Test
    public void solutionNumbersAtTheStartOfTheList() {

      int[] numbers = {2, 7, 11, 15};
      int target = 9;
      int[] numbersAddUptoSum = twoSum.twoSum2(numbers, target);

      assertThat(numbersAddUptoSum).containsOnly(2, 7);
    }

    @Test
    public void solutionNumbersAtTheEndOfTheList() {

      int[] numbers = {2, 7, 11, 15};
      int target = 26;
      int[] numbersAddUptoSum = twoSum.twoSum2(numbers, target);

      assertThat(numbersAddUptoSum).containsOnly(15, 11);
    }

    @Test
    public void solutionWithNegativeNumbersInTheList() {

      int[] numbers = {3, 5, -4, 8, 11, 1, -1, 6};
      int target = 10;
      int[] numbersAddUptoSum = twoSum.twoSum2(numbers, target);

      assertThat(numbersAddUptoSum).containsOnly(11, -1);
    }

    @Test
    public void solutionBigList() {

      IntStream numbers = IntStream.rangeClosed(1, 10000000);
      int target = 19999999;

      int[] numbersAddUptoSum = twoSum.twoSum2(numbers.toArray(), target);

      assertThat(numbersAddUptoSum).containsOnly(10000000 - 1, 10000000);
    }

    @Test
    public void solutionNumbersNotInTheList() {

      int[] numbers = {2, 7, 11, 15};
      int target = 5;
      int[] numbersAddUptoSum = twoSum.twoSum2(numbers, target);

      assertThat(numbersAddUptoSum).isEmpty();
    }
  }

  private void assertIndexes(
      int[] numbersAddUptoSum, int expectedFirstIndex, int expectedSecondIndex) {

    assertThat(numbersAddUptoSum[0]).isEqualTo(expectedFirstIndex);
    assertThat(numbersAddUptoSum[1]).isEqualTo(expectedSecondIndex);
    assertThat(numbersAddUptoSum[0] < numbersAddUptoSum[1]).isEqualTo(true);
  }
}
