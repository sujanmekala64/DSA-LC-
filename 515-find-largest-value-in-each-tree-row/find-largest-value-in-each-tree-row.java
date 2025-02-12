class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> li = new ArrayList<>();
        if(root==null) return li;
        while(!queue.isEmpty()){
            int size=queue.size();
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr.val>maxi) maxi=curr.val;
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            li.add(maxi);
        }
        return li;
    }
}