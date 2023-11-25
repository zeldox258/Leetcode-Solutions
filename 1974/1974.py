class Solution:
    def minimum_time_to_type_word_using_special_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count