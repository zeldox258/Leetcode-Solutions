class Solution:
    def minimum_distance_between_bst_nodes(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_distance_between_bst_nodes(root.left), self.minimum_distance_between_bst_nodes(root.right))