class Solution {
    public String getEncryptedString(String s, int k) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            int n = (i+k)%s.length();
            ans = ans+s.charAt(n);
        }
        return ans;
    }
}