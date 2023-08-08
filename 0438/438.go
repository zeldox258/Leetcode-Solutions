func findAllAnagramsInAString(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findAllAnagramsInAString(root.Left)
	r := findAllAnagramsInAString(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}