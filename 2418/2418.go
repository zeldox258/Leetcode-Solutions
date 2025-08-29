func sortThePeople(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sortThePeople(root.Left)
	r := sortThePeople(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}