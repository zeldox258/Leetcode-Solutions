class Solution:
    def largest_bst_subtree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.largest_bst_subtree(root.left), self.largest_bst_subtree(root.right))