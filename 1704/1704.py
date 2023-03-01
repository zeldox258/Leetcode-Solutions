class Solution:
    def determine_if_string_halves_are_alike(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count