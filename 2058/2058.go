func findTheMinimumAndMaximumNumber(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findTheMinimumAndMaximumNumber(root.Left)
	r := findTheMinimumAndMaximumNumber(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}