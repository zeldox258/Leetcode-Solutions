class Solution:
    def shortest_and_lexicographically_smallest_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count