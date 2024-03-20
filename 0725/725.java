
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0; ListNode cur = head; while (cur != null) { len++; cur = cur.next; }
        int base = len / k, extra = len % k;
        ListNode[] res = new ListNode[k]; cur = head;
        for (int i = 0; i < k; i++) {
            res[i] = cur;
            int size = base + (i < extra ? 1 : 0);
            for (int j = 0; j < size - 1; j++) if (cur != null) cur = cur.next;
            if (cur != null) { ListNode next = cur.next; cur.next = null; cur = next; }
        }
        return res;
    }
}
