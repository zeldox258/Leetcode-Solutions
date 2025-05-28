class Solution:
    def mirror_distance_of_an_integer(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.mirror_distance_of_an_integer(root.left), self.mirror_distance_of_an_integer(root.right))