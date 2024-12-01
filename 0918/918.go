func maximumSumCircularSubarray(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumSumCircularSubarray(root.Left)
	r := maximumSumCircularSubarray(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}