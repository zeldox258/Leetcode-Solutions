class Solution:
    def shortest_distance_after_road_addition_qu(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.shortest_distance_after_road_addition_qu(root.left), self.shortest_distance_after_road_addition_qu(root.right))