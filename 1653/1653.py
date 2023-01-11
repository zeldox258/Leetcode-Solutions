class Solution:
    def minimum_deletions_to_make_string_balance(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_deletions_to_make_string_balance(root.left), self.minimum_deletions_to_make_string_balance(root.right))