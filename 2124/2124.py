class Solution:
    def check_if_all_as_appears_before_all_bs(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count