class Solution:
    def shortest_path_to_get_all_keys(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count