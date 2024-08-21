func simpleBankSystem(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := simpleBankSystem(root.Left)
	r := simpleBankSystem(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}