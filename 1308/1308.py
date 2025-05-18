class Solution:
    def running_total_for_different_genders(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.running_total_for_different_genders(root.left), self.running_total_for_different_genders(root.right))