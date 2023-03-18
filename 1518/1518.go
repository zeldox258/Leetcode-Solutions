func waterBottles(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := waterBottles(root.Left)
	r := waterBottles(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}