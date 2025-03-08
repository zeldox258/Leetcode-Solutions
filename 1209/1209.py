class Solution:
    def remove_all_adjacent_duplicates_in_string(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count