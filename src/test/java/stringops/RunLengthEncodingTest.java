package stringops;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RunLengthEncodingTest {

  @ParameterizedTest
  @CsvSource(
      value = {
        "A, 1A",
        "AB, 1A1B",
        "AAB, 2A1B",
        "AAABBBCCDAA, 3A3B2C1D2A",
        "AAAAAAAAAAAAABBCCCCDD, 9A4A2B4C2D"
      })
  void shouldReturnRunLengthEncodingSingleLetter(String input, String expected) {
    var runLengthEncoding = new RunLengthEncoding();

    var result = runLengthEncoding.runLengthEncoding(input);

    assertThat(result).isEqualTo(expected);
  }
}
