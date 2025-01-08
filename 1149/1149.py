class Solution:
    def article_views_ii(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count