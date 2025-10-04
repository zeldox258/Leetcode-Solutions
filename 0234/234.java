class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;}
        ListNode prev=null,cur=slow;
        while(cur!=null){ListNode next=cur.next;cur.next=prev;prev=cur;cur=next;}
        while(prev!=null){if(prev.val!=head.val)return false;prev=prev.next;head=head.next;}
        return true;
    }
}