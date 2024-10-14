class Solution:
    def unit_conversion_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.unit_conversion_i(root.left), self.unit_conversion_i(root.right))