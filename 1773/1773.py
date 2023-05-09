class Solution:
    def count_items_matching_a_rule(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_items_matching_a_rule(root.left), self.count_items_matching_a_rule(root.right))