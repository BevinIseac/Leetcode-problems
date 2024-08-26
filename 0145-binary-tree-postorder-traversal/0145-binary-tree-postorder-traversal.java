class Solution {
    public void inorder(TreeNode root, List<Integer> result)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,result);   
        inorder(root.right,result);
        result.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>(); 
        inorder(root,result); 
        return result;
    }
}