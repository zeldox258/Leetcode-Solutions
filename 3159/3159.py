class Solution:
    def find_occurrences_of_an_element_in_an_arr(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count