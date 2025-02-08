class Solution {
    List<String> ans = new ArrayList<>();
    public void paths(TreeNode root,List<String> li){
        if(root==null) return ;
        li.add(root.val+"");
        if(root.left==null && root.right==null){
            String val = String.join("->",li);
            ans.add(val);
        }
        paths(root.left,new ArrayList(li));
        paths(root.right,new ArrayList(li));
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li = new ArrayList<>();
        paths(root,li);
        return ans;
    }
}