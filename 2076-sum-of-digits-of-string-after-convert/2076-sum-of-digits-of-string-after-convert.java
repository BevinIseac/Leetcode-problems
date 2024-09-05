class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numericString = new StringBuilder();
        for (char c : s.toCharArray()) {
            int position = c - 'a' + 1;
            numericString.append(position);
        }
        String currentString = numericString.toString();
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (char c : currentString.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            currentString = Integer.toString(sum);
        }
        return Integer.parseInt(currentString);
    }
}
