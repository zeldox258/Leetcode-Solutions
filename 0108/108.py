class Solution:
    def convert_sorted_array_to_binary_search_tr(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.convert_sorted_array_to_binary_search_tr(root.left), self.convert_sorted_array_to_binary_search_tr(root.right))