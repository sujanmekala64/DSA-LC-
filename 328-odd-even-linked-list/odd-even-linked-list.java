/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode oddpos = null;
        ListNode oddtemp = oddpos;
        ListNode evenpos = null;
        ListNode eventemp = evenpos;
        int cnt=0;
        while(head!=null){
            int val = head.val;
            ListNode newnode = new ListNode(val);
            if(cnt%2!=0){
                if(oddpos==null){
                    oddpos=newnode;
                    oddtemp=oddpos;
                }
                else{
                    oddtemp.next=newnode;
                    oddtemp=oddtemp.next;
                }
            }
            else{
                if(evenpos==null){
                    evenpos=newnode;
                    eventemp=evenpos;
                }
                else{
                    eventemp.next=newnode;
                    eventemp=eventemp.next;
                }
            }
            head=head.next;
            cnt++;
        }
        eventemp.next=oddpos;
        return evenpos;
    }
}