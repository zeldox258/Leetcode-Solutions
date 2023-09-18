class Solution:
    def equal_tree_partition(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.equal_tree_partition(root.left), self.equal_tree_partition(root.right))