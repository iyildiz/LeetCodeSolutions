package stringops;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstNonRepeatingCharacterTest {

    @Nested
    class OnTime_O1Space {

        @Test
        void firstNonRepeatingCharReturnsIndex() {
            assertThat(new FirstNonRepeatingCharacter().firstNonRepeatingCharacter1("abcdcaf")).isEqualTo(1);
        }

        @Test
        void noNonRepeatingCharReturnsMinusOne() {
            assertThat(new FirstNonRepeatingCharacter().firstNonRepeatingCharacter1("abccab")).isEqualTo(-1);
        }
    }

    @Nested
    class On2Time_O1Space {

        @Test
        void firstNonRepeatingCharReturnsIndex() {
            assertThat(new FirstNonRepeatingCharacter().firstNonRepeatingCharacter2("abcdcaf")).isEqualTo(1);
        }

        @Test
        void noNonRepeatingCharReturnsMinusOne() {
            assertThat(new FirstNonRepeatingCharacter().firstNonRepeatingCharacter2("abccab")).isEqualTo(-1);
        }
    }
}
