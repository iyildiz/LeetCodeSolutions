package stringops;

public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {

        if(s.equals("")){
            return 0;
        }

        int maxLength = 1;
        StringBuilder currentSubString = new StringBuilder();
        for(int currentIndex=0; currentIndex < s.length();currentIndex++){

            String charAtCurrentIndex = s.substring(currentIndex, currentIndex + 1);
            if(isCharAlreadyInCurrentSubstring(currentSubString, charAtCurrentIndex)){
                maxLength = Math.max(currentSubString.length(), maxLength);
                currentSubString.delete(0, currentSubString.indexOf(charAtCurrentIndex) + 1);
            }
            currentSubString.append(charAtCurrentIndex);
        }

        return  Math.max(currentSubString.length(), maxLength);
    }

    private boolean isCharAlreadyInCurrentSubstring(StringBuilder currentSubString, String charAtCurrentIndex) {
        return currentSubString.indexOf(charAtCurrentIndex) >= 0;
    }
}
