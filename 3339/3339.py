class Solution:
    def find_the_number_of_keven_arrays(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count