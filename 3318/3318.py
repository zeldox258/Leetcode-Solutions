class Solution:
    def find_xsum_of_all_klong_subarrays_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_xsum_of_all_klong_subarrays_i(root.left), self.find_xsum_of_all_klong_subarrays_i(root.right))