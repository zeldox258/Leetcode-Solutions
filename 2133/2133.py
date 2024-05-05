class Solution:
    def check_if_every_row_and_column_contains_a(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.check_if_every_row_and_column_contains_a(root.left), self.check_if_every_row_and_column_contains_a(root.right))