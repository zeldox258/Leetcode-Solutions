func shortestPathInAGridWithObstacl(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := shortestPathInAGridWithObstacl(root.Left)
	r := shortestPathInAGridWithObstacl(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}