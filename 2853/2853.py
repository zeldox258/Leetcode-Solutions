class Solution:
    def highest_salaries_difference(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.highest_salaries_difference(root.left), self.highest_salaries_difference(root.right))