func jsonDeepEqual(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := jsonDeepEqual(root.Left)
	r := jsonDeepEqual(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}