class Solution:
    def minimum_cost_walk_in_weighted_graph(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_cost_walk_in_weighted_graph(root.left), self.minimum_cost_walk_in_weighted_graph(root.right))