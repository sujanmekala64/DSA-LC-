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
    public int getDecimalValue(ListNode head) {
        String s ="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        int n=s.length()-1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans+=Math.pow(2,n);
            }
            n--;
        }
        return ans;
    }
}