class Solution:
    def find_duplicate_file_in_system(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count