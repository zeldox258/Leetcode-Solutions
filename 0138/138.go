func copyListWithRandomPointer(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := copyListWithRandomPointer(root.Left)
	r := copyListWithRandomPointer(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}