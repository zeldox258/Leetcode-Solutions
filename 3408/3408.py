class Solution:
    def design_task_manager(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.design_task_manager(root.left), self.design_task_manager(root.right))