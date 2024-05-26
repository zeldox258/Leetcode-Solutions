class Solution:
    def team_dominance_by_pass_success(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count