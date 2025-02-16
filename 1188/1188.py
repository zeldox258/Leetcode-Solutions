class Solution:
    def design_bounded_blocking_queue(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.design_bounded_blocking_queue(root.left), self.design_bounded_blocking_queue(root.right))