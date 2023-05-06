class Solution:
    def random_pick_with_weight(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.random_pick_with_weight(root.left), self.random_pick_with_weight(root.right))