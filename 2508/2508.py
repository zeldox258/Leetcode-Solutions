class Solution:
    def add_edges_to_make_degrees_of_all_nodes_e(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.add_edges_to_make_degrees_of_all_nodes_e(root.left), self.add_edges_to_make_degrees_of_all_nodes_e(root.right))