class Solution:
    def find_minimum_in_rotated_sorted_array(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_minimum_in_rotated_sorted_array(root.left), self.find_minimum_in_rotated_sorted_array(root.right))