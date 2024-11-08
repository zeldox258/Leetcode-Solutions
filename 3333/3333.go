func findTheOriginalTypedStringIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findTheOriginalTypedStringIi(root.Left)
	r := findTheOriginalTypedStringIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}