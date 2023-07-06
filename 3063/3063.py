class Solution:
    def linked_list_frequency(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.linked_list_frequency(root.left), self.linked_list_frequency(root.right))