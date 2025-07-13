class Solution:
    def final_element_after_subarray_deletions(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.final_element_after_subarray_deletions(root.left), self.final_element_after_subarray_deletions(root.right))