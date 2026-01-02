class Solution {
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){slow=slow.next;fast=fast.next.next;}
        ListNode second=slow.next;slow.next=null;
        ListNode prev=null,cur=second;
        while(cur!=null){ListNode next=cur.next;cur.next=prev;prev=cur;cur=next;}
        second=prev;ListNode first=head;
        while(second!=null){ListNode tmp1=first.next,tmp2=second.next;first.next=second;second.next=tmp1;first=tmp1;second=tmp2;}
    }
}