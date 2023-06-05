class Solution:
    def logical_or_of_two_binary_grids_represent(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.logical_or_of_two_binary_grids_represent(root.left), self.logical_or_of_two_binary_grids_represent(root.right))