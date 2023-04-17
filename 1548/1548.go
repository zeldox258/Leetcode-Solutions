func theMostSimilarPathInAGraph(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := theMostSimilarPathInAGraph(root.Left)
	r := theMostSimilarPathInAGraph(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}