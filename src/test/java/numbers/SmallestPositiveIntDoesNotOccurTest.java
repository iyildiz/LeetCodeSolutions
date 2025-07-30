package numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestPositiveIntDoesNotOccurTest {

  @ParameterizedTest
  @MethodSource("scenarios")
  void smallestPositiveIntDoesNotOccur(int expectedNumber, int[] list) {
    var smallestPositiveIntDoesNotOccur = new SmallestPositiveIntDoesNotOccur();
    var result =
        smallestPositiveIntDoesNotOccur.smallestPositiveIntDoesNotOccur(list);
    assertThat(result).isEqualTo(expectedNumber);
  }

  private static List<Arguments> scenarios() {

    return List.of(
            Arguments.of(4, new int[] {1, 2, 3}),
            Arguments.of(1, new int[] {-1, -2, -3}),
            Arguments.of(3, new int[] {1, 2, 4, 10, 100, 1000})
    );
  }
}
