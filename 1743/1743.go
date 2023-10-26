func restoreTheArrayFromAdjacentPai(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := restoreTheArrayFromAdjacentPai(root.Left)
	r := restoreTheArrayFromAdjacentPai(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}