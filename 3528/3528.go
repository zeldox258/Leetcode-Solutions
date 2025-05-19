func unitConversionI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := unitConversionI(root.Left)
	r := unitConversionI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}