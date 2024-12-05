class Solution:
    def minimum_steps_to_convert_string_with_ope(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count