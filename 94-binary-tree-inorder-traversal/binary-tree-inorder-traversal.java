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
    public List<Integer> inorderTraversal(TreeNode root) {
        //iterative approach
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> li = new ArrayList<>();
        TreeNode node = root;
        if(node==null) return li;
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }
            else{
                if(stack.isEmpty()) break;
                node = stack.pop();
                li.add(node.val);
                node=node.right;
            }
        }
        return li;
    }
}