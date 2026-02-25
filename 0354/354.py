class Solution:
    def russian_doll_envelopes(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count