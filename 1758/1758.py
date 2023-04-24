class Solution:
    def minimum_changes_to_make_alternating_bina(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_changes_to_make_alternating_bina(root.left), self.minimum_changes_to_make_alternating_bina(root.right))