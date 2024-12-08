class Solution:
    def design_a_number_container_system(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count