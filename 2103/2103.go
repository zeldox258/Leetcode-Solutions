func ringsAndRods(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := ringsAndRods(root.Left)
	r := ringsAndRods(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}