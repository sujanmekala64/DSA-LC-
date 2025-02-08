class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return li;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(i==size-1) li.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right); //we give last right so i=size-1 will be ans
            }
        }
        return li;
    }
}