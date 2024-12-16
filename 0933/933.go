func numberOfRecentCalls(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfRecentCalls(root.Left)
	r := numberOfRecentCalls(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}