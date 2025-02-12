class Solution {
    List<Integer> li = new ArrayList<>();
    public void preorder(TreeNode root){
        if(root==null) return ;
        li.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        preorder(root);
        Collections.sort(li,Collections.reverseOrder());
        if(li.size()<2) return -1;
        int last = li.get(li.size()-1);
        int lastbefore = li.get(li.size()-2);
        while(li.size()!=0){
            if(lastbefore>last) return lastbefore;
            li.remove(li.size()-1);
            last=lastbefore;
            if(li.size()<2) break;
            lastbefore=li.get(li.size()-2);
        }
        return -1;
    }
}