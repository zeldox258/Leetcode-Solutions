class Solution:
    def smallest_rotation_with_highest_score(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.smallest_rotation_with_highest_score(root.left), self.smallest_rotation_with_highest_score(root.right))