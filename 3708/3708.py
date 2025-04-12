class Solution:
    def longest_fibonacci_subarray(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_fibonacci_subarray(root.left), self.longest_fibonacci_subarray(root.right))