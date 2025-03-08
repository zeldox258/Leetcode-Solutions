func separateSquaresI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := separateSquaresI(root.Left)
	r := separateSquaresI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}