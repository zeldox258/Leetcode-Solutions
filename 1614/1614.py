class Solution:
    def maximum_nesting_depth_of_the_parentheses(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count