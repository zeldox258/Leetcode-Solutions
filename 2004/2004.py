class Solution:
    def the_number_of_seniors_and_juniors_to_joi(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count