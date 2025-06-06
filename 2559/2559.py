class Solution:
    def count_vowel_strings_in_ranges(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count