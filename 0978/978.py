class Solution:
    def longest_turbulent_subarray(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_turbulent_subarray(root.left), self.longest_turbulent_subarray(root.right))