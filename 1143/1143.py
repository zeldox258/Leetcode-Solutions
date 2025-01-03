class Solution:
    def longest_common_subsequence(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_common_subsequence(root.left), self.longest_common_subsequence(root.right))