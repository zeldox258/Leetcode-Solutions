func findTheIndexOfTheLargeInteger(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findTheIndexOfTheLargeInteger(root.Left)
	r := findTheIndexOfTheLargeInteger(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}