class Solution:
    def maximum_number_of_removal_queries_that_c(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_number_of_removal_queries_that_c(root.left), self.maximum_number_of_removal_queries_that_c(root.right))