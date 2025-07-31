func changeNullValuesInATableToTheP(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := changeNullValuesInATableToTheP(root.Left)
	r := changeNullValuesInATableToTheP(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}