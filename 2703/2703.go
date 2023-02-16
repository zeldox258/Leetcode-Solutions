func returnLengthOfArgumentsPassed(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := returnLengthOfArgumentsPassed(root.Left)
	r := returnLengthOfArgumentsPassed(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}