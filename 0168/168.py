class Solution:
    def excel_sheet_column_title(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.excel_sheet_column_title(root.left), self.excel_sheet_column_title(root.right))