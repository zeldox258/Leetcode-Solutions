func maximumPerformanceOfATeam(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumPerformanceOfATeam(root.Left)
	r := maximumPerformanceOfATeam(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}