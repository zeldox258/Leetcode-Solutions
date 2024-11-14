class Solution:
    def number_of_ways_to_assign_edge_weights_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_ways_to_assign_edge_weights_i(root.left), self.number_of_ways_to_assign_edge_weights_i(root.right))