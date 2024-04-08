func gameOfNim(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := gameOfNim(root.Left)
	r := gameOfNim(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}