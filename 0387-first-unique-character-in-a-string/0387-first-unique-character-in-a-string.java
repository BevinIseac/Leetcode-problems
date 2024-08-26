class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (arr[c - 'a'] != -1) {
                arr[c - 'a'] = -2;
                continue;
            } else {
                arr[c - 'a'] = i;
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 0) {
                return arr[i];
            }
        }
        return -1;
    }
}