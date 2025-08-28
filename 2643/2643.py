class Solution:
    def row_with_maximum_ones(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.row_with_maximum_ones(root.left), self.row_with_maximum_ones(root.right))