class Solution:
    def replace_elements_with_greatest_element_o(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count