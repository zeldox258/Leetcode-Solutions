class Solution:
    def count_substrings_starting_and_ending_wit(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count