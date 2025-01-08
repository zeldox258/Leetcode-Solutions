func countPathsWithTheGivenXorValue(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countPathsWithTheGivenXorValue(root.Left)
	r := countPathsWithTheGivenXorValue(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}