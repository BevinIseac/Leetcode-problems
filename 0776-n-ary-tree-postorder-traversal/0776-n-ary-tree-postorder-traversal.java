
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root==null) return new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        list.add(root.val); 

        for(int i = 0;i<root.children.size();i++) stack.push(root.children.get(i));

        while(!stack.isEmpty()){

            Node node = stack.pop();
            list.add(node.val);
            for(int i = 0;i<node.children.size();i++) stack.push(node.children.get(i));

        }
        Collections.reverse(list);
        return list;

        
    }
}