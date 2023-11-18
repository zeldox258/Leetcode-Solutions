class Solution:
    def array_with_elements_not_equal_to_average(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.array_with_elements_not_equal_to_average(root.left), self.array_with_elements_not_equal_to_average(root.right))