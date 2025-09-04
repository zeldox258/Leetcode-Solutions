class Solution:
    def nested_array_generator(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count