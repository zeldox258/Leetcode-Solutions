func uniqueWordAbbreviation(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := uniqueWordAbbreviation(root.Left)
	r := uniqueWordAbbreviation(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}