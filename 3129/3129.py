class Solution:
    def find_all_possible_stable_binary_arrays_i(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count