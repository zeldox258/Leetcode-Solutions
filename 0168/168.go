func excelSheetColumnTitle(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := excelSheetColumnTitle(root.Left)
	r := excelSheetColumnTitle(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}