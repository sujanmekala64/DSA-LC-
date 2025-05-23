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
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return validate(root,min,max);
    }
    public boolean validate(TreeNode root,long min,long max){
        if(root==null) return true;
        if(root.val>=max || root.val<=min) return false;
        boolean left = validate(root.left,min,root.val);
        boolean right = validate(root.right,root.val,max);
        return left&&right;
    }
}