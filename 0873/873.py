class Solution:
    def length_of_longest_fibonacci_subsequence(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.length_of_longest_fibonacci_subsequence(root.left), self.length_of_longest_fibonacci_subsequence(root.right))