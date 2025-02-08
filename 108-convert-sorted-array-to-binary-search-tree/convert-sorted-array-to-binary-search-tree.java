class Solution {
    public TreeNode createtree(int nums[],int left,int right){
        if(left>right) return null;
        int mid = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createtree(nums,left,mid-1);
        node.right = createtree(nums,mid+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       return createtree(nums,0,nums.length-1);
    }
}