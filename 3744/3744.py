class Solution:
    def find_kth_character_in_expanded_string(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count