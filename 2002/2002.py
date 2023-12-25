class Solution:
    def maximum_product_of_the_length_of_two_pal(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev, cur = None, head
        while cur:
            cur.next, prev, cur = prev, cur, cur.next
        return prev