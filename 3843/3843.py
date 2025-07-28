class Solution:
    def first_element_with_unique_frequency(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.first_element_with_unique_frequency(root.left), self.first_element_with_unique_frequency(root.right))