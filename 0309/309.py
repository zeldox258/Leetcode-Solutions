class Solution:
    def best_time_to_buy_and_sell_stock_with_coo(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count