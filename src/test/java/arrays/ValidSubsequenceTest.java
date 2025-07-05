package arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidSubsequenceTest {

  @ParameterizedTest(name = "{0}")
  @MethodSource("isValidSubsequenceTestCases")
  void isValidSubsequence(
      String description, List<Integer> array, List<Integer> sequence, boolean expected) {
    var validSubsequence = new ValidSubsequence();
    assertThat(validSubsequence.isValidSubsequence(array, sequence)).isEqualTo(expected);
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("isValidSubsequenceTestCases")
  void isValidSubsequenceRecursive(
      String description, List<Integer> array, List<Integer> sequence, boolean expected) {
    var validSubsequence = new ValidSubsequence();
    assertThat(validSubsequence.isValidSubsequenceRecursive(array, sequence)).isEqualTo(expected);
  }

  private static Stream<Arguments> isValidSubsequenceTestCases() {
    return Stream.of(
        Arguments.of("isValidSubsequenceSimpleCase", List.of(1, 2, 3, 4), List.of(1, 2, 3), true),
        Arguments.of(
            "isValidSubsequenceComplexCase",
            List.of(5, 1, 22, 25, 6, -1, 8, 10),
            List.of(1, 6, -1, 10),
            true),
        Arguments.of("isValidSubsequenceInvalidCase", List.of(1, 2, 3, 4), List.of(1, 2, 5), false),
        Arguments.of("isValidSubsequenceInvalidCase", List.of(), List.of(1, 2, 5), false));
  }
}
