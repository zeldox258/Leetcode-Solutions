class Solution:
    def generate_a_string_with_characters_that_h(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count