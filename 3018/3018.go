func maximumNumberOfRemovalQueriesT(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumNumberOfRemovalQueriesT(root.Left)
	r := maximumNumberOfRemovalQueriesT(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}