func findCitiesInEachState(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findCitiesInEachState(root.Left)
	r := findCitiesInEachState(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}