class Solution:
    def best_time_to_buy_and_sell_stock_v(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.best_time_to_buy_and_sell_stock_v(root.left), self.best_time_to_buy_and_sell_stock_v(root.right))