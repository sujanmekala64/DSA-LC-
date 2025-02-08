class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //Iterative instead of recurssion
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> li = new ArrayList<>();
        if(root==null) return li;
        stack.push(root);
        while(!stack.isEmpty()){
            int size=stack.size();
            for(int i=0;i<size;i++){
                TreeNode curr = stack.pop();
                if(curr!=null) li.add(curr.val);
                if(curr.right!=null) stack.push(curr.right);
                if(curr.left!=null) stack.push(curr.left);
            }
        }
        return li;
    } //we first send right because this is stack
}