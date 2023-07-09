func validWordAbbreviation(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := validWordAbbreviation(root.Left)
	r := validWordAbbreviation(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}