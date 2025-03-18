class Solution:
    def longest_arithmetic_subsequence_of_given_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.longest_arithmetic_subsequence_of_given_(root.left), self.longest_arithmetic_subsequence_of_given_(root.right))