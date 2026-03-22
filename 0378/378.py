class Solution:
    def kth_smallest_element_in_a_sorted_matrix(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.kth_smallest_element_in_a_sorted_matrix(root.left), self.kth_smallest_element_in_a_sorted_matrix(root.right))