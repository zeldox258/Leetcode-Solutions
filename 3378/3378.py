class Solution:
    def count_connected_components_in_lcm_graph(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_connected_components_in_lcm_graph(root.left), self.count_connected_components_in_lcm_graph(root.right))