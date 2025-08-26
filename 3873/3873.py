class Solution:
    def maximum_points_activated_with_one_additi(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_points_activated_with_one_additi(root.left), self.maximum_points_activated_with_one_additi(root.right))