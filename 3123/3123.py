class Solution:
    def find_edges_in_shortest_paths(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_edges_in_shortest_paths(root.left), self.find_edges_in_shortest_paths(root.right))