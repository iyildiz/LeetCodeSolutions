package stringops;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter1(String input) {

        var existingCharacterOccurrences = new LinkedHashMap<Character, CharacterOccurrence>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            var numberOfOccurrence = existingCharacterOccurrences.get(ch);
            existingCharacterOccurrences.put(ch,
                    numberOfOccurrence == null ? new CharacterOccurrence(i, 1) :
                            new CharacterOccurrence(i, numberOfOccurrence.occurrence + 1));
        }

        var firstNonRepeatingCharacter = existingCharacterOccurrences.entrySet()
                .stream()
                .filter(entry -> entry.getValue().occurrence == 1)
                .findFirst();

        return firstNonRepeatingCharacter.map(entry
                -> entry.getValue().firstIndex).orElse(-1);
    }

    public int firstNonRepeatingCharacter2(String input) {

        for(int i = 0; i < input.length() ; i++) {
            var repeatingChar = false;
            for(int j = 0; j < input.length(); j++) {
                if(i !=j && input.charAt(i) == input.charAt(j)) {
                    repeatingChar = true;
                    break;
                }
            }
            if(!repeatingChar) return i;
        }

        return -1;
    }

    private record CharacterOccurrence(int firstIndex, int occurrence) {}
}
