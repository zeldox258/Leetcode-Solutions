class Solution:
    def find_the_sequence_of_strings_appeared_on(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count