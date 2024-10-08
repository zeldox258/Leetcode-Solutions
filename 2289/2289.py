class Solution:
    def steps_to_make_array_nondecreasing(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count