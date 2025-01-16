class Solution:
    def market_analysis_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.market_analysis_i(root.left), self.market_analysis_i(root.right))