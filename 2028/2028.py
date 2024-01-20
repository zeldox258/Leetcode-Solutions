class Solution:
    def find_missing_observations(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_missing_observations(root.left), self.find_missing_observations(root.right))