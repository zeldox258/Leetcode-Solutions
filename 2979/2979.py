class Solution:
    def most_expensive_item_that_can_not_be_boug(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count