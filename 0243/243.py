class Solution:
    def shortest_word_distance(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.shortest_word_distance(root.left), self.shortest_word_distance(root.right))