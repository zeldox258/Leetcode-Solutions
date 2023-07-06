class Solution:
    def maximum_ice_cream_bars(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_ice_cream_bars(root.left), self.maximum_ice_cream_bars(root.right))