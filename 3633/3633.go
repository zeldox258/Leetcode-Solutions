func earliestFinishTimeForLandAndWa(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := earliestFinishTimeForLandAndWa(root.Left)
	r := earliestFinishTimeForLandAndWa(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}