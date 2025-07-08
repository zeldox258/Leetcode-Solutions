class Solution:
    def count_all_valid_pickup_and_delivery_opti(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count