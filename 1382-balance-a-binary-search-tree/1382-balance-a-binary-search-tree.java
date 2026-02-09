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
    public void inorder(TreeNode root,List<Integer> li){
        if(root==null) return ;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
    }
    public TreeNode build(List<Integer> li,int left,int right){
        if(left>right) return null;
        int mid = (left+right)/2;
        TreeNode newnode = new TreeNode(li.get(mid));
        newnode.left = build(li,left,mid-1);
        newnode.right = build(li,mid+1,right);
        return newnode;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        inorder(root,li);
        return build(li,0,li.size()-1);
    }
}