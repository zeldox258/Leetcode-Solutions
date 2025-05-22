
class Solution {
    public ListNode plusOne(ListNode head) {
        if(addOne(head)==1){ListNode newHead=new ListNode(1);newHead.next=head;return newHead;}
        return head;
    }
    int addOne(ListNode node){
        if(node==null) return 1;
        int carry=addOne(node.next);
        int sum=node.val+carry; node.val=sum%10; return sum/10;
    }
}
