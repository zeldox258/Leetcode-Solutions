func findMissingObservations(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findMissingObservations(root.Left)
	r := findMissingObservations(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}