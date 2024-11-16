public class Solution {
    public ListNode MaximumSubsequenceScore(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            var next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}