class Solution:
    def number_of_ways_to_stay_in_the_same_place(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count