func reverseDegreeOfAString(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := reverseDegreeOfAString(root.Left)
	r := reverseDegreeOfAString(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}