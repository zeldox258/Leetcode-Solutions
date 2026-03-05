func finalElementAfterSubarrayDelet(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := finalElementAfterSubarrayDelet(root.Left)
	r := finalElementAfterSubarrayDelet(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}