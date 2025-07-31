class Solution:
    def maximum_performance_of_a_team(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_performance_of_a_team(root.left), self.maximum_performance_of_a_team(root.right))