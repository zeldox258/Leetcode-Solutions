class Solution:
    def find_the_closest_palindrome(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count