class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lo=new ListNode(0),hi=new ListNode(0),l=lo,h=hi;
        for(ListNode cur=head;cur!=null;cur=cur.next){if(cur.val<x){l.next=cur;l=l.next;}else{h.next=cur;h=h.next;}}
        h.next=null;l.next=hi.next;return lo.next;
    }
}