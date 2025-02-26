class Solution:
    def find_the_least_frequent_digit(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_least_frequent_digit(root.left), self.find_the_least_frequent_digit(root.right))