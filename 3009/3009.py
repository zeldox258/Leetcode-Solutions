class Solution:
    def maximum_number_of_intersections_on_the_c(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count