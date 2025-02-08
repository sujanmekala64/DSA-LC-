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
    public List<Integer> postorderTraversal(TreeNode root) {
        //iterative 2 stacks
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        List<Integer> li = new ArrayList<>();
        if(root==null) return li;
        stk1.push(root);
        while(!stk1.isEmpty()){
            int size = stk1.size();
            for(int i=0;i<size;i++){
                TreeNode curr = stk1.pop();
                stk2.push(curr.val);
                if(curr.left!=null) stk1.push(curr.left);
                if(curr.right!=null) stk1.push(curr.right);
            }
        } 
        while(!stk2.isEmpty()){
            li.add(stk2.pop());
        }
        return li;   
    }
}