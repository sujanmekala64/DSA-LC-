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
    int sum=0;
    public void check(TreeNode root,String newstr){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            newstr+=String.valueOf(root.val);
            int val = Integer.parseInt(newstr);
            sum+=val;
            return ;
        }
        String a = String.valueOf(root.val);
        check(root.left,newstr+a);
        check(root.right,newstr+a);
    }
    public int sumNumbers(TreeNode root) {
        check(root,"");
        return sum;
    }
}