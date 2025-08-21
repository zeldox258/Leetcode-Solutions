class Solution:
    def number_of_steps_to_reduce_a_number_in_bi(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count