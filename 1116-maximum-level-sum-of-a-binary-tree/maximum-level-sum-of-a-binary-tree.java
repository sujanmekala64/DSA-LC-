class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level_sum=0;
        int maxi=-10000;
        int c=1;
        int lev=0;
        while(!queue.isEmpty()){
            level_sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                level_sum += curr.val;
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            if(level_sum>maxi){
                maxi=level_sum;
                lev=c;
            }
            c++;
        }
        return lev;
    }
} 