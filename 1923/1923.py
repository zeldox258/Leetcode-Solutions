class Solution:
    def longest_common_subpath(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_common_subpath(root.left), self.longest_common_subpath(root.right))