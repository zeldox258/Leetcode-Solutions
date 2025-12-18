func maximum69Number(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximum69Number(root.Left)
	r := maximum69Number(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}