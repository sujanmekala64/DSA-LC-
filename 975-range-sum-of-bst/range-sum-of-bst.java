class Solution {
    int tot;
    public int rangeSumBST(TreeNode root, int low, int high) {
        tot=0;
       if(root==null) return tot;
       traverse(root,low,high);
       return tot;
    }
    public int traverse(TreeNode root,int low,int high){
        if(root==null) return 0;
        if(root.val<high) traverse(root.right,low,high);
        if(root.val>low) traverse(root.left,low,high);
        if(root.val>=low && root.val<=high) tot+=root.val;
        return tot;
    }
}
