class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next,prev=dummy;
            while(prev.next!=null&&prev.next.val<cur.val) prev=prev.next;
            cur.next=prev.next;prev.next=cur;cur=next;
        }
        return dummy.next;
    }
}