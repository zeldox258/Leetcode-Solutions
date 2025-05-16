class Solution:
    def difference_between_maximum_and_minimum_p(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.difference_between_maximum_and_minimum_p(root.left), self.difference_between_maximum_and_minimum_p(root.right))