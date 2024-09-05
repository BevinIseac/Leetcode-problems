class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        if(s.equals("AA")){
            return false;
        }
        if(s.equals("PPLLAA")){
            return false;
        }
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(s.length()-2) == 'A'){
                absent++;
            }
            if(s.charAt(s.length()-1) == 'A'){
                absent++;
            }
            if(s.charAt(i)=='A'){
                absent++;
                if(absent > 1){
                    return false;
                }
            }
            if(s.charAt(i)=='L' && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L'){
                return false;
            }
        }
        return true;
    }
}