class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev = null;
        ListNode aft=null;
        while(curr!=null){
            aft=curr.next;
            curr.next=prev;
            prev=curr;
            curr=aft;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode check=null;
        ListNode temps=check;
        ListNode ans=null;
        ListNode temp=ans;
        int c=1;
        while(head!=null){
            ListNode newnode = new ListNode(head.val);
            if(check==null){
                check=newnode;
                temps=newnode;
            }
            else{
                temps.next=newnode;
                temps=newnode;
            }
            if(c==k){
                check=reverse(check);
                if(ans==null){
                    ans=check;
                    temp=check;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                }
                else{
                    temp.next=check;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                }
                c=0;
                check=null;
                temps=check;
            }
            c++;
            head=head.next;
        }
        while(check!=null){
            ListNode newnode = new ListNode(check.val);
            temp.next=newnode;
            temp=newnode;
            check=check.next;
        }
       return ans;
    }
}