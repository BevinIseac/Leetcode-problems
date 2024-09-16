class Solution {
    public boolean isAcronym(List<String> words, String s) { 
        if (words.size() != s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String word = words.get(i);
            if (s.charAt(i) != word.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
