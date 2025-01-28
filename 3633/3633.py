class Solution:
    def earliest_finish_time_for_land_and_water_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.earliest_finish_time_for_land_and_water_(root.left), self.earliest_finish_time_for_land_and_water_(root.right))