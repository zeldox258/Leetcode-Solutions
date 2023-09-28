func distributeCandiesAmongChildren(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := distributeCandiesAmongChildren(root.Left)
	r := distributeCandiesAmongChildren(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}