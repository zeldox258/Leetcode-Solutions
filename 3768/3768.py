class Solution:
    def minimum_inversion_count_in_subarrays_of_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_inversion_count_in_subarrays_of_(root.left), self.minimum_inversion_count_in_subarrays_of_(root.right))