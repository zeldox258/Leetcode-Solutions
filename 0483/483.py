class Solution:
    def smallest_good_base(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.smallest_good_base(root.left), self.smallest_good_base(root.right))