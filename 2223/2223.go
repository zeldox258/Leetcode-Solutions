func sumOfScoresOfBuiltStrings(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sumOfScoresOfBuiltStrings(root.Left)
	r := sumOfScoresOfBuiltStrings(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}