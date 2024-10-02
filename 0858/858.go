func mirrorReflection(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := mirrorReflection(root.Left)
	r := mirrorReflection(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}