func findMaximumAreaOfATriangle(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findMaximumAreaOfATriangle(root.Left)
	r := findMaximumAreaOfATriangle(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}