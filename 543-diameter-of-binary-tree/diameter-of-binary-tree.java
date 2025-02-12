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
class Solution{
    int ans=0;
    public int check(TreeNode root){
        if(root==null) return 0;
        int le = check(root.left);
        int ri = check(root.right);
        ans=Math.max(ans,le+ri);
        return 1+Math.max(le,ri);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        check(root);
        return ans;
    }
}