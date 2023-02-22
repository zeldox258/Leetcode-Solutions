class Solution:
    def distribute_candies_among_children_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.distribute_candies_among_children_i(root.left), self.distribute_candies_among_children_i(root.right))