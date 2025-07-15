class Solution:
    def smallest_missing_nonnegative_integer_aft(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.smallest_missing_nonnegative_integer_aft(root.left), self.smallest_missing_nonnegative_integer_aft(root.right))