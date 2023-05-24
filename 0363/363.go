func maxSumOfRectangleNoLargerThanK(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maxSumOfRectangleNoLargerThanK(root.Left)
	r := maxSumOfRectangleNoLargerThanK(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}