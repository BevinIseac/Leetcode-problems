class Solution {
    public int longestPalindromeSubseq(String s) {
        int len=s.length();
        int mat[][]=new int[len][len];
        int j;
   for(int d=1;d<=len;d++){
      for(int i=0;i<=len-d;i++){
        j=d+i-1;
            if(i==j){
               mat[i][j]=1;
            }
            else if(s.charAt(i)==s.charAt(j)){
                mat[i][j]=2+mat[i+1][j-1];
            }
            else if(i>j){
               mat[i][j]=0;
            }
            else{
               mat[i][j]= Math.max(mat[i+1][j],mat[i][j-1]);
            }
        }
   }
   return mat[0][len-1];
    }
}
  