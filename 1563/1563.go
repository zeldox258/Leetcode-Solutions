func stoneGameV(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := stoneGameV(root.Left)
	r := stoneGameV(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}