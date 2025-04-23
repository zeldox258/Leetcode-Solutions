class Solution:
    def search_in_rotated_sorted_array(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.search_in_rotated_sorted_array(root.left), self.search_in_rotated_sorted_array(root.right))