func minimumMovesToMoveABoxToTheirT(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumMovesToMoveABoxToTheirT(root.Left)
	r := minimumMovesToMoveABoxToTheirT(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}