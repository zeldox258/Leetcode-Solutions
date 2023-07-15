func highestSalariesDifference(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := highestSalariesDifference(root.Left)
	r := highestSalariesDifference(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}