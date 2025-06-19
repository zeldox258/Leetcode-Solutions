func numberOfWaysToAssignEdgeWeight(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfWaysToAssignEdgeWeight(root.Left)
	r := numberOfWaysToAssignEdgeWeight(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}