class Solution:
    def count_number_of_nice_subarrays(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_number_of_nice_subarrays(root.left), self.count_number_of_nice_subarrays(root.right))