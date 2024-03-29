func minimumCostWalkInWeightedGraph(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumCostWalkInWeightedGraph(root.Left)
	r := minimumCostWalkInWeightedGraph(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}