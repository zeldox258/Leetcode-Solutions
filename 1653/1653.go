func minimumDeletionsToMakeStringBa(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumDeletionsToMakeStringBa(root.Left)
	r := minimumDeletionsToMakeStringBa(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}