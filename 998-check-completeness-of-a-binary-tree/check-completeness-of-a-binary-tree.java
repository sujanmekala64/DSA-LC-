class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean check = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr==null) check=true;
            else{
                if(check==true) return false;
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        return check;
    }
}