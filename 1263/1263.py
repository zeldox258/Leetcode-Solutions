class Solution:
    def minimum_moves_to_move_a_box_to_their_tar(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_moves_to_move_a_box_to_their_tar(root.left), self.minimum_moves_to_move_a_box_to_their_tar(root.right))