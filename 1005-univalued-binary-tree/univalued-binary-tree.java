class Solution {
    public boolean check(TreeNode root,int value){
        if(root==null) return true;
        if(root.val!=value) return false;
        return check(root.left,value) && check(root.right,value);
    } 
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        boolean ans = check(root,value);
        return ans;
    }
}