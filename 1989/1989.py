class Solution:
    def maximum_number_of_people_that_can_be_cau(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count