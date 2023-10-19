class Solution:
    def maximum_genetic_difference_query(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_genetic_difference_query(root.left), self.maximum_genetic_difference_query(root.right))