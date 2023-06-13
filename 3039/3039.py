class Solution:
    def apply_operations_to_make_string_empty(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count