
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        inOrder(root,li);
        return isSorted(li);
        
    }
    public void inOrder(TreeNode root, List<Integer> list)
    {
        if(root!=null){
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }
    boolean isSorted(List<Integer> list){
        for(int i = 1; i < list.size();i++){
            if(list.get(i)<=list.get(i-1))
                return false;
        }
        return true;
    }
}