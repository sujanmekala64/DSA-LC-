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
    List<List<Integer>> ans = new ArrayList<>();
    public void check(TreeNode root,int targetSum,List<Integer> path,List<List<Integer>> ans){
        if(root==null) return ;
        path.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val){
            System.out.println(path);
            ans.add(path);
        }
        check(root.left,targetSum-root.val,new ArrayList(path),ans);
        check(root.right,targetSum-root.val,new ArrayList(path),ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        check(root,targetSum,new ArrayList(),ans);
        return ans;
    }
}