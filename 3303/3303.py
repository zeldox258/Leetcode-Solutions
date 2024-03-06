class Solution:
    def find_the_occurrence_of_first_almost_equa(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_occurrence_of_first_almost_equa(root.left), self.find_the_occurrence_of_first_almost_equa(root.right))