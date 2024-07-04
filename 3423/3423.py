class Solution:
    def maximum_difference_between_adjacent_elem(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_difference_between_adjacent_elem(root.left), self.maximum_difference_between_adjacent_elem(root.right))