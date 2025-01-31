class Solution:
    def immediate_food_delivery_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.immediate_food_delivery_i(root.left), self.immediate_food_delivery_i(root.right))