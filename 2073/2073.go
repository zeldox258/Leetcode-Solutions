func timeNeededToBuyTickets(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := timeNeededToBuyTickets(root.Left)
	r := timeNeededToBuyTickets(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}