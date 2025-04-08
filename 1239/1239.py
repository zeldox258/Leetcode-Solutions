class Solution:
    def maximum_length_of_a_concatenated_string_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count