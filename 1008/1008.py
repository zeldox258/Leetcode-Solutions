class Solution:
    def construct_binary_search_tree_from_preord(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.construct_binary_search_tree_from_preord(root.left), self.construct_binary_search_tree_from_preord(root.right))