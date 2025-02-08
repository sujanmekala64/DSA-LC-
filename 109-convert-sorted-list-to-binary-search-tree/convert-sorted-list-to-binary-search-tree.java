class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode slowptr = head;
        ListNode fastptr = head;
        ListNode slowptr_prev=null;
        while(fastptr!=null && fastptr.next!=null){
            slowptr_prev=slowptr; // we need to break this to get left part
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        slowptr_prev.next=null;
        TreeNode root = new TreeNode(slowptr.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slowptr.next);
        return root;
    }
}