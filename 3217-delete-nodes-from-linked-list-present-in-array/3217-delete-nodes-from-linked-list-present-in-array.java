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
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        // ListNode dummy = new ListNode(0,head);
        // for(ListNode curr=dummy;curr.next!=null;){
        //     if(set.contains(curr.next.val)) curr.next=curr.next.next;
        //     else curr=curr.next;
        // }
        // return dummy.next;
        ListNode temp = head;
        ListNode ans = null;
        ListNode temps = ans;
        while(temp!=null){
            if(!set.contains(temp.val)){
                ListNode newnode = new ListNode(temp.val);
                if(ans==null){
                    ans=newnode;
                    temps=newnode;
                }
                else{
                    temps.next=newnode;
                    temps=newnode;
                }
            }
            temp=temp.next;
        }
        return ans;
    }
}