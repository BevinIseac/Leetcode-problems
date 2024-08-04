class Solution {
    public int countSegments(String s) {
        if(s.trim().length()==0){
            return 0;
        }else{
        String []str = s.trim().split("\\s+");
        return str.length;
        }
    }
}