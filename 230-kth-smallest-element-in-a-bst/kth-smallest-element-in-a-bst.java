class Solution {
    List<Integer> li = new ArrayList<>();
    public void preorder(TreeNode root){
        if(root==null) return ;
        li.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        preorder(root);
        Collections.sort(li,Collections.reverseOrder());
        if(li.size()<2) return root.val;
        int last=li.get(li.size()-1);
        int lastbefore=li.get(li.size()-2);
        while(k!=0){
            if(last<lastbefore){
                k--;
                if(k==0) break;
            }
            last=lastbefore;
            li.remove(li.size()-1);
            if(li.size()<2) break;
            lastbefore=li.get(li.size()-2);
        }
        return last;
    }
}