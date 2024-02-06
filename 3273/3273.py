class Solution:
    def minimum_amount_of_damage_dealt_to_bob(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_amount_of_damage_dealt_to_bob(root.left), self.minimum_amount_of_damage_dealt_to_bob(root.right))