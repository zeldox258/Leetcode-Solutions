class Solution:
    def remove_digit_from_number_to_maximize_res(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count