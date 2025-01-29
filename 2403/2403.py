class Solution:
    def minimum_time_to_kill_all_monsters(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_time_to_kill_all_monsters(root.left), self.minimum_time_to_kill_all_monsters(root.right))