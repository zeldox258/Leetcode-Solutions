func detectSquares(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := detectSquares(root.Left)
	r := detectSquares(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}