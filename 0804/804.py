class Solution:
    def unique_morse_code_words(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count