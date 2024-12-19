class Solution:
    def number_of_equivalent_domino_pairs(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_equivalent_domino_pairs(root.left), self.number_of_equivalent_domino_pairs(root.right))