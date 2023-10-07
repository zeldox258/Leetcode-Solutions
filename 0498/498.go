func diagonalTraverse(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := diagonalTraverse(root.Left)
	r := diagonalTraverse(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}