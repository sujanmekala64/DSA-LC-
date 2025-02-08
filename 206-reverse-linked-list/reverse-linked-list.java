class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode aft = null;
        while(head!=null){
            aft = head.next;
            head.next = prev;
            prev = head;
            head = aft;
        }
        return prev;
    }
    public ListNode reverseList(ListNode head) {
        ListNode temp = reverse(head);
        return temp;
    }
}