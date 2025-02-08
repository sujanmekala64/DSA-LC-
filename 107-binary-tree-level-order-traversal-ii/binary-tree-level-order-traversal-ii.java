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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> st = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr!=null) li.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            st.push(li);
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
}