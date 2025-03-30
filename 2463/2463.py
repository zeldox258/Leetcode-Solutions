class Solution:
    def minimum_total_distance_traveled(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_total_distance_traveled(root.left), self.minimum_total_distance_traveled(root.right))