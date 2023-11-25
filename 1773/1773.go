func countItemsMatchingARule(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countItemsMatchingARule(root.Left)
	r := countItemsMatchingARule(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}