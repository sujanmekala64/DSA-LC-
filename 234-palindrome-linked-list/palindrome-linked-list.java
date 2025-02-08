class Solution {
    ListNode reverse(ListNode curr){
        ListNode prev = null;
        ListNode aft = null;
        while(curr!=null){
            aft = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aft;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        ListNode starts = head;
        while(fastptr!=null && fastptr.next!=null){
            starts=slowptr;
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        starts.next=null;
        slowptr = reverse(slowptr);
        while(head!=null && slowptr!=null){
            if(head.val!=slowptr.val) return false;
            head=head.next;
            slowptr=slowptr.next;
        }
        return true;
    }
}