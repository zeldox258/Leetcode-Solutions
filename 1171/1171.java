
class Solution {
    public ListNode removeZeroSumConsecutiveNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        Map<Integer,ListNode> map=new LinkedHashMap<>();
        int sum=0;
        for(ListNode cur=dummy;cur!=null;cur=cur.next){
            sum+=cur.val;
            map.put(sum,cur);
        }
        sum=0;
        for(ListNode cur=dummy;cur!=null;cur=cur.next){
            sum+=cur.val;
            cur.next=map.get(sum).next;
        }
        return dummy.next;
    }
}
