func addDigits(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := addDigits(root.Left)
	r := addDigits(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}