class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++) prev=prev.next;
        ListNode cur=prev.next;
        for(int i=0;i<right-left;i++){ListNode next=cur.next;cur.next=next.next;next.next=prev.next;prev.next=next;}
        return dummy.next;
    }
}