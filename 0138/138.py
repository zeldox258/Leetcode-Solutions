class Solution:
    def copy_list_with_random_pointer(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.copy_list_with_random_pointer(root.left), self.copy_list_with_random_pointer(root.right))