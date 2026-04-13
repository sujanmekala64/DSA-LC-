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
    List<Integer> li;
    int size;
    Random rand;
    public Solution(ListNode head) {
        li=new ArrayList<>();
        rand=new Random();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        size=li.size();
    }
    
    public int getRandom() {
        int idx=rand.nextInt(size);
        return li.get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */