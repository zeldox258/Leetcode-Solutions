func lastMomentBeforeAllAntsFallOut(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := lastMomentBeforeAllAntsFallOut(root.Left)
	r := lastMomentBeforeAllAntsFallOut(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}