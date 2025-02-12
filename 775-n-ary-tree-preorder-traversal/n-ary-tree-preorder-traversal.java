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
    List<Integer> output = new ArrayList<>();
    public void preordertraversal(Node root){
        if(root==null) return ;
        output.add(root.val);
        for(Node child:root.children){
            preordertraversal(child);
        }
    }
    public List<Integer> preorder(Node root) {
        preordertraversal(root);
        return output;
    }
}