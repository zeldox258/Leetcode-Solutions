func utf8Validation(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := utf8Validation(root.Left)
	r := utf8Validation(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}