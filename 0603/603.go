func consecutiveAvailableSeats(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := consecutiveAvailableSeats(root.Left)
	r := consecutiveAvailableSeats(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}