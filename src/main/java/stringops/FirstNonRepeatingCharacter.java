package stringops;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter1(String input) {

        var existingCharacterOccurrences = new LinkedHashMap<Character, Integer>();
        for (char ch : input.toCharArray()) {
            var numberOfOccurrence = existingCharacterOccurrences.get(ch);
            existingCharacterOccurrences.put(ch, numberOfOccurrence == null ? 1 : numberOfOccurrence  + 1);
        }

        var firstNonRepeatingCharacter = existingCharacterOccurrences.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();

        return firstNonRepeatingCharacter.map(ch
                -> input.indexOf(ch.getKey())).orElse(-1);
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

}
