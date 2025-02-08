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
    public int check(TreeNode root,int targetSum){
        if(root==null) return 0;
        if(root.left==null && root.right==null && targetSum==root.val) return -1;
        int le = check(root.left,targetSum-root.val);
        if(le==-1) return -1;
        int ri = check(root.right,targetSum-root.val);
        if(ri==-1) return -1;
        if(le==-1 && ri==-1) return -1;
        else return 0;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Queue<TreeNode> queue = new LinkedList<>();
        // Queue<Integer> sum = new LinkedList<>();
        // if(root==null) return false;
        // queue.offer(root);
        // sum.offer(root.val);
        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     for(int i=0;i<size;i++){
        //         TreeNode curr = queue.poll();
        //         int tempsum = sum.poll();
        //         if(curr.left==null && curr.right==null && tempsum==targetSum) return true;
        //         if(curr.left!=null){
        //             queue.offer(curr.left);
        //             sum.offer(curr.left.val+tempsum);
        //         }
        //         if(curr.right!=null){
        //             queue.offer(curr.right);
        //             sum.offer(curr.right.val+tempsum);
        //         }
        //     }
        // }
        // return false;
        return check(root,targetSum)==-1;
    }
}