class Solution:
    def bitwise_user_permissions_analysis(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count