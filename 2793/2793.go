func statusOfFlightTickets(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := statusOfFlightTickets(root.Left)
	r := statusOfFlightTickets(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}