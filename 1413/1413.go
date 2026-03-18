func minimumValueToGetPositiveStepB(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumValueToGetPositiveStepB(root.Left)
	r := minimumValueToGetPositiveStepB(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}