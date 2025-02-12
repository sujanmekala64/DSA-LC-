class Solution {
  int sum=0;
  public void check(TreeNode root){
     if(root==null) return ;
     if(root.left!=null && root.left.left==null && root.left.right==null){
        sum += root.left.val;
     }
     check(root.left);
     check(root.right);
  }
  public int sumOfLeftLeaves(TreeNode root) {
    check(root);
    return sum;
  }
}