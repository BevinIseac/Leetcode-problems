class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        if((n%3==0||n%3==1||n%3==2)&&(n%4!=0)){
            return true;
        }
        else{
            return false;
        }
    }
}