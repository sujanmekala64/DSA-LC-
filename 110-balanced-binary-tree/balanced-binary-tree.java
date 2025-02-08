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
    public int maxdepth(TreeNode root){
        if(root==null) return 0;
        int le = maxdepth(root.left);
        if(le==-1) return -1;
        int ri = maxdepth(root.right);
        if(ri==-1) return -1;
        if(Math.abs(le-ri)>1) return -1;
        return 1+Math.max(le,ri);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return maxdepth(root)!=-1;
    }
}