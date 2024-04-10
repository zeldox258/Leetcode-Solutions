class Solution:
    def adding_spaces_to_a_string(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count