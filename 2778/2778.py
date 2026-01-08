class Solution:
    def sum_of_squares_of_special_elements(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_squares_of_special_elements(root.left), self.sum_of_squares_of_special_elements(root.right))