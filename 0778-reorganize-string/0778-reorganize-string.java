class Solution {
    public String reorganizeString(String s) {
        int strLen = s.length();
        var charCounter = new int[26];
        for (char c : s.toCharArray()) {
            charCounter[c - 'a']++;
        }
        int maxOccurance = 0;
        int letterIndex = 0;
        for (int i = 0; i < charCounter.length; i++) {
            if (charCounter[i] > maxOccurance) {
                maxOccurance = charCounter[i];
                letterIndex = i;
            }
        }
        if (maxOccurance > (strLen + 1) / 2) {
            return "";
        }
        var result = new char[strLen];
        int index = 0;
        while (charCounter[letterIndex] != 0) {
            result[index] = (char) (letterIndex + 'a');
            index += 2;
            charCounter[letterIndex]--;
        }
        for (int i = 0; i < charCounter.length; i++) {
            while (charCounter[i] > 0){
                if (index >= s.length()) {
                    index = 1;
                }
                result[index] = (char) (i + 'a');
                index += 2;
                charCounter[i]--;
            }
        }
        return String.valueOf(result);
    }
}