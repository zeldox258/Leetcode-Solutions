class Solution:
    def subarrays_distinct_element_sum_of_square(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.subarrays_distinct_element_sum_of_square(root.left), self.subarrays_distinct_element_sum_of_square(root.right))