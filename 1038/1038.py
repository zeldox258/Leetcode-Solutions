class Solution:
    def binary_search_tree_to_greater_sum_tree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.binary_search_tree_to_greater_sum_tree(root.left), self.binary_search_tree_to_greater_sum_tree(root.right))