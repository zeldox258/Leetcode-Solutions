class Solution:
    def special_array_with_x_elements_greater_th(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.special_array_with_x_elements_greater_th(root.left), self.special_array_with_x_elements_greater_th(root.right))