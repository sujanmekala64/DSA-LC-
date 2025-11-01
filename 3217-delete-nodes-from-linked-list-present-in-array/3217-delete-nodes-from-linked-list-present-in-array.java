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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> li = new HashSet<>();
        for(int num:nums) li.add(num);
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        while(head!=null){
            if(!li.contains(head.val)){
                ListNode val = new ListNode(head.val);
                tail.next=val;
                tail=tail.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}