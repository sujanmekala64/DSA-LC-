class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) head=head.next;
        ListNode temp  = head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val!=val) temp = temp.next;
            else temp.next = temp.next.next;
        }
        return head;  
    }
}