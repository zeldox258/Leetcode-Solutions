func theWordingGame(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := theWordingGame(root.Left)
	r := theWordingGame(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}