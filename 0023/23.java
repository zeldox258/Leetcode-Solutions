import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for (ListNode n : lists) if (n!=null) pq.offer(n);
        ListNode dummy = new ListNode(0), cur = dummy;
        while (!pq.isEmpty()) {
            cur.next = pq.poll();
            cur = cur.next;
            if (cur.next != null) pq.offer(cur.next);
        }
        return dummy.next;
    }
}