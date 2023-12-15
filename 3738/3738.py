class Solution:
    def longest_nondecreasing_subarray_after_rep(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_nondecreasing_subarray_after_rep(root.left), self.longest_nondecreasing_subarray_after_rep(root.right))