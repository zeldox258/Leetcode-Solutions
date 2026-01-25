class Solution {
    public ListNode solve3143(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode prev=null,cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;prev=cur;cur=next;
        }
        return prev;
    }
}