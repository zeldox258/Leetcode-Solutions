func shortestWordDistance(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := shortestWordDistance(root.Left)
	r := shortestWordDistance(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}