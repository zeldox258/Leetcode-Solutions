class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);dummy.next=head;
        ListNode prev=dummy;
        while(prev.next!=null){
            ListNode cur=prev.next;boolean dup=false;
            while(cur.next!=null&&cur.next.val==cur.val){cur=cur.next;dup=true;}
            if(dup) prev.next=cur.next; else prev=prev.next;
        }
        return dummy.next;
    }
}