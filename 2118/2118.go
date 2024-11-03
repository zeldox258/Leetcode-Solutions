func buildTheEquation(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := buildTheEquation(root.Left)
	r := buildTheEquation(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}