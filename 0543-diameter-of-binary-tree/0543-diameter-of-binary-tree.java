
class Solution {
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // int dia = 0;
        ht(root);
        return dia;
    }
    public int ht(TreeNode root){
        if(root == null) return -1;
        int lh = ht(root.left);
        int rh = ht(root.right);
        dia = Math.max(dia, lh+rh+2);
        return 1 + Math.max(lh,rh);
    }
}