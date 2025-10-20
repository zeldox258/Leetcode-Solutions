class Solution:
    def maximum_product_of_two_elements_in_an_ar(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count