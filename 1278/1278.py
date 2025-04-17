class Solution:
    def palindrome_partitioning_iii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.palindrome_partitioning_iii(root.left), self.palindrome_partitioning_iii(root.right))