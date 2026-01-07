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
    long sum=0;
    long ans=0;
    public long findSum(TreeNode root){
        if(root==null) return 0;
        return root.val+findSum(root.left)+findSum(root.right);
    }
    public long findMax(TreeNode root){
        if(root==null) return 0;
        long total = root.val+findMax(root.left)+findMax(root.right);
        ans = Math.max(ans,(total*(sum-total)));
        return total;
    }
    public int maxProduct(TreeNode root) {
        sum=findSum(root);
        int mod = 1_000_000_007;
        findMax(root);
        return (int)(ans%mod);
    }
}