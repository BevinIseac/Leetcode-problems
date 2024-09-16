class Solution {
    public int countKeyChanges(String s) {
        String a = s.toLowerCase();
        int count=0;
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)!=a.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}