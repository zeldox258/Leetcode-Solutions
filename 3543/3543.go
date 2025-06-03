func maximumWeightedKedgePath(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumWeightedKedgePath(root.Left)
	r := maximumWeightedKedgePath(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}