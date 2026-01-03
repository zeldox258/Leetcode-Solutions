func separateTheDigitsInAnArray(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := separateTheDigitsInAnArray(root.Left)
	r := separateTheDigitsInAnArray(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}