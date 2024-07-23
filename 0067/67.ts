function addBinary(head: ListNode | null): ListNode | null {
    let prev: ListNode | null = null, cur = head;
    while (cur) {
        const next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }
    return prev;
}