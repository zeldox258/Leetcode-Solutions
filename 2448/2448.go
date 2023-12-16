func minimumCostToMakeArrayEqual(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumCostToMakeArrayEqual(root.Left)
	r := minimumCostToMakeArrayEqual(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}