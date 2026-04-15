class Solution:
    def longest_substring_without_repeating_char(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_substring_without_repeating_char(root.left), self.longest_substring_without_repeating_char(root.right))