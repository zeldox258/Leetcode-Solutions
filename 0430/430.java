
class Solution {
    public Node flatten(Node head) {
        Node cur=head;
        while(cur!=null){
            if(cur.child!=null){
                Node child=cur.child, next=cur.next;
                cur.next=child; child.prev=cur; cur.child=null;
                Node tail=child; while(tail.next!=null) tail=tail.next;
                tail.next=next; if(next!=null) next.prev=tail;
            }
            cur=cur.next;
        }
        return head;
    }
}
