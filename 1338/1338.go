func reduceArraySizeToTheHalf(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := reduceArraySizeToTheHalf(root.Left)
	r := reduceArraySizeToTheHalf(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}