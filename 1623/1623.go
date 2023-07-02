func allValidTripletsThatCanReprese(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := allValidTripletsThatCanReprese(root.Left)
	r := allValidTripletsThatCanReprese(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}