func minimumCostToMakeAtLeastOneVal(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumCostToMakeAtLeastOneVal(root.Left)
	r := minimumCostToMakeAtLeastOneVal(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}