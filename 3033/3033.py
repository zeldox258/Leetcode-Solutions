class Solution:
    def modify_the_matrix(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.modify_the_matrix(root.left), self.modify_the_matrix(root.right))