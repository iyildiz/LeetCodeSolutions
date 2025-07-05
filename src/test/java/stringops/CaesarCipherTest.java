package stringops;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class CaesarCipherTest {

  @Test
  void caesarCipherTestNoWrap() {
    assertThat(new CaesarCipher().encrypt("abc", 2)).isEqualTo("cde");
  }

  @Test
  void caesarCipherTestWithWrap() {
    assertThat(new CaesarCipher().encrypt("xyz", 2)).isEqualTo("zab");
  }
}
