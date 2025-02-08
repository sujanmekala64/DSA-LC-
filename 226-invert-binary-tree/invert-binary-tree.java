class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode le = invertTree(root.left);
        TreeNode ri = invertTree(root.right);
        root.left=ri;
        root.right=le;
        return root;
    }
}