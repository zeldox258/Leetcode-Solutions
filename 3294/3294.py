class Solution:
    def convert_doubly_linked_list_to_array_ii(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count