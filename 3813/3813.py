class Solution:
    def vowelconsonant_score(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.vowelconsonant_score(root.left), self.vowelconsonant_score(root.right))