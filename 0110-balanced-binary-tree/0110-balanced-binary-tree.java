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
    boolean ans=true;
    public int checkDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        // int le = 0;
        // int ri = 0;
        int le=checkDepth(root.left);
        int ri=checkDepth(root.right);
        if(Math.abs(le-ri)>1) ans=false;
        return 1+Math.max(le,ri);
    }
    public boolean isBalanced(TreeNode root) {
        int g= checkDepth(root);
        return ans;
    }
}