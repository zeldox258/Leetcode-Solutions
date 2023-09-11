func numberOfDistinctSubstringsInAS(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfDistinctSubstringsInAS(root.Left)
	r := numberOfDistinctSubstringsInAS(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}