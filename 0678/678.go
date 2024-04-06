func validParenthesisString(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := validParenthesisString(root.Left)
	r := validParenthesisString(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}