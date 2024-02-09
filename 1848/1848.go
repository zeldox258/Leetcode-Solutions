func minimumDistanceToTheTargetElem(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumDistanceToTheTargetElem(root.Left)
	r := minimumDistanceToTheTargetElem(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}