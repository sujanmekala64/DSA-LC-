/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode le = lowestCommonAncestor(root.left,p,q);
        TreeNode ri = lowestCommonAncestor(root.right,p,q);
        if(le==null) return ri;
        else if(ri==null) return le;
        else return root; //this condition comes when both are not null 
    }
}