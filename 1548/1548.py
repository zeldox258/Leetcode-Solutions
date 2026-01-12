class Solution:
    def the_most_similar_path_in_a_graph(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.the_most_similar_path_in_a_graph(root.left), self.the_most_similar_path_in_a_graph(root.right))