func shortestDistanceAfterRoadAddit(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := shortestDistanceAfterRoadAddit(root.Left)
	r := shortestDistanceAfterRoadAddit(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}