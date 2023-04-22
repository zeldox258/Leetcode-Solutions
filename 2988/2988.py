class Solution:
    def manager_of_the_largest_department(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.manager_of_the_largest_department(root.left), self.manager_of_the_largest_department(root.right))