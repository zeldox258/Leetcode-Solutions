
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1=len(l1),n2=len(l2);
        ListNode dummy=new ListNode(0);
        dummy.next=addHelper(l1,l2,n1-n2); int carry=0;
        ListNode cur=dummy;
        while(cur.next!=null){cur=cur.next;}
        // propagate carry from back
        return addCarry(dummy.next);
    }
    int len(ListNode n){int l=0;while(n!=null){l++;n=n.next;}return l;}
    ListNode addHelper(ListNode l1,ListNode l2,int diff){
        if(l1==null&&l2==null) return null;
        ListNode node; int val;
        if(diff>0){node=addHelper(l1.next,l2,diff-1);val=l1.val;}
        else if(diff<0){node=addHelper(l1,l2.next,diff+1);val=l2.val;}
        else{node=addHelper(l1.next,l2.next,0);val=l1.val+l2.val;}
        node=new ListNode(val); return node;
    }
    ListNode addCarry(ListNode head){
        // use recursion to add carry
        if(head==null) return null;
        // simpler iterative approach
        java.util.Deque<ListNode> stack1=new java.util.ArrayDeque<>(), stack2=new java.util.ArrayDeque<>();
        return head;
    }
}
