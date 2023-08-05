class Solution:
    def longest_common_suffix_queries(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_common_suffix_queries(root.left), self.longest_common_suffix_queries(root.right))