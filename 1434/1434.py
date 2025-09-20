class Solution:
    def number_of_ways_to_wear_different_hats_to(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count