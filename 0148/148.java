class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;}
        ListNode mid=slow.next;slow.next=null;
        ListNode l=sortList(head),r=sortList(mid);
        ListNode dummy=new ListNode(0),cur=dummy;
        while(l!=null&&r!=null){if(l.val<=r.val){cur.next=l;l=l.next;}else{cur.next=r;r=r.next;}cur=cur.next;}
        cur.next=l!=null?l:r;return dummy.next;
    }
}