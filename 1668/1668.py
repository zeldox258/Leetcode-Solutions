class Solution:
    def maximum_repeating_substring(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_repeating_substring(root.left), self.maximum_repeating_substring(root.right))