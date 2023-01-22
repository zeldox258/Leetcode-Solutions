class Solution:
    def maximum_linear_stock_score(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_linear_stock_score(root.left), self.maximum_linear_stock_score(root.right))