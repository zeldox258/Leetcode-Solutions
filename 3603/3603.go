func minimumCostPathWithAlternating(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumCostPathWithAlternating(root.Left)
	r := minimumCostPathWithAlternating(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}