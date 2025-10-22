package stringops;

public class RunLengthEncoding {

  public String runLengthEncoding(String text) {

    var result = new StringBuilder();
    int occurrenceCount = 0;
    Character currentChar = null;
    for (Character c : text.toCharArray()) {
      if (c == currentChar) {

        if (occurrenceCount == 9) {
          result.append(occurrenceCount).append(currentChar);
          occurrenceCount = 1;
        } else {
          occurrenceCount++;
        }

      } else {
        if (occurrenceCount > 0) {
          result.append(occurrenceCount).append(currentChar);
        }

        currentChar = c;
        occurrenceCount = 1;
      }
    }

    if (occurrenceCount > 0) {
      result.append(occurrenceCount);
    }
    result.append(currentChar);
    return result.toString();
  }
}
