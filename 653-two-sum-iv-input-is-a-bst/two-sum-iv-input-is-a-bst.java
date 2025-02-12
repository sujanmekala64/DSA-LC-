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
    boolean ans=false;
    HashSet<Integer> set = new HashSet<>();
    public void check(TreeNode root,int k){
        if(root==null) return ; 
        if(!set.contains(root.val)){
            set.add(k-root.val);
        }
        else{
            ans=true;
        }
        check(root.left,k);
        check(root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        check(root,k);
        return ans;
    }
}