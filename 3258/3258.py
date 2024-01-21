class Solution:
    def count_substrings_that_satisfy_kconstrain(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_substrings_that_satisfy_kconstrain(root.left), self.count_substrings_that_satisfy_kconstrain(root.right))