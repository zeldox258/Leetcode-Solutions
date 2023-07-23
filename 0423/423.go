func reconstructOriginalDigitsFromE(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := reconstructOriginalDigitsFromE(root.Left)
	r := reconstructOriginalDigitsFromE(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}