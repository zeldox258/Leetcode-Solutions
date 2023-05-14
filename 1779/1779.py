class Solution:
    def find_nearest_point_that_has_the_same_x_o(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count