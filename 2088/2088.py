class Solution:
    def count_fertile_pyramids_in_a_land(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_fertile_pyramids_in_a_land(root.left), self.count_fertile_pyramids_in_a_land(root.right))