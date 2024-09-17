class Solution:
    def minimum_number_of_keypresses(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_number_of_keypresses(root.left), self.minimum_number_of_keypresses(root.right))