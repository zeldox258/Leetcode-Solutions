func crackingTheSafe(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := crackingTheSafe(root.Left)
	r := crackingTheSafe(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}