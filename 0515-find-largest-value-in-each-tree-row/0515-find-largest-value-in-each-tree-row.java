/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) {
            return new ArrayList<>(0);
        }

        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            int currMaxNode = Integer.MIN_VALUE;
            while(size-- > 0) {
                TreeNode curr = queue.poll();
                currMaxNode = Math.max(currMaxNode, curr.val);

                if(curr.left != null) {
                    queue.offer(curr.left);
                }
                if(curr.right != null) {
                    queue.offer(curr.right);
                }
                
            }
            result.add(currMaxNode);
        }

        return result;
    }
}