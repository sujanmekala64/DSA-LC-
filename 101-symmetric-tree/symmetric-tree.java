class Solution {
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        return check(root1.left,root2.right) && check(root1.right,root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}