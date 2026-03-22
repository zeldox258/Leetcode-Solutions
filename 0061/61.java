class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        int len=1;ListNode tail=head;
        while(tail.next!=null){tail=tail.next;len++;}
        tail.next=head;
        k=k%len;int steps=len-k;
        ListNode cur=head;
        for(int i=1;i<steps;i++) cur=cur.next;
        head=cur.next;cur.next=null;
        return head;
    }
}