class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String res = "";
        for(int i=0;i<str.length;i++){
            String a = str[i];
            String b ="";
            for(int j=a.length()-1;j>=0;j--){
                b = b+a.charAt(j);
            }
            res = res + b + " ";
        }
        return res.trim();
    }
}