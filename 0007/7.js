/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseInteger = function(head) {
    let prev = null, cur = head;
    while (cur) {
        const next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }
    return prev;
};