class Solution {
    public int countSeniors(String[] str) {
        int count =0;
        for(int i=0;i<str.length;i++){
            String s ="";
            s= str[i].substring(11,13);
            int a = Integer.parseInt(s);
            if(a>60){
                count++;
            }
        }
        return count;
    }
}