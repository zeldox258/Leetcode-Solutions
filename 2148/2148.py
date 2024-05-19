class Solution:
    def count_elements_with_strictly_smaller_and(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_elements_with_strictly_smaller_and(root.left), self.count_elements_with_strictly_smaller_and(root.right))