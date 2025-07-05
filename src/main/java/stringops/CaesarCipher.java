package stringops;

public class CaesarCipher {

  private static final int ALPHABET_SIZE = 26;

  public String encrypt(String input, int shift) {

    var result = new StringBuilder();
    for (char c : input.toCharArray()) {
      var shiftedPositionInAlphabet = (getPositionInAlphabet(c) + shift) % ALPHABET_SIZE;
      result.append(convertPositionInAlphabetToChar(shiftedPositionInAlphabet));
    }
    return result.toString();
  }

  private char convertPositionInAlphabetToChar(int positionInAlphabet) {
    return (char) ('a' + positionInAlphabet);
  }

  private int getPositionInAlphabet(char c) {
    return c - 'a';
  }
}
