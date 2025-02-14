class Solution:
    def sort_the_people(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sort_the_people(root.left), self.sort_the_people(root.right))