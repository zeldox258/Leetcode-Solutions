class Solution:
    def egg_drop_with_2_eggs_and_n_floors(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count