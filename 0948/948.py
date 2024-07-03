class Solution:
    def bag_of_tokens(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.bag_of_tokens(root.left), self.bag_of_tokens(root.right))