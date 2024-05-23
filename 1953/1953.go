func maximumNumberOfWeeksForWhichYo(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumNumberOfWeeksForWhichYo(root.Left)
	r := maximumNumberOfWeeksForWhichYo(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}