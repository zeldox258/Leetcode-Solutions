class Solution:
    def minimum_flips_in_binary_tree_to_get_resu(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_flips_in_binary_tree_to_get_resu(root.left), self.minimum_flips_in_binary_tree_to_get_resu(root.right))