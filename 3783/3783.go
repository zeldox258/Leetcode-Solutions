func mirrorDistanceOfAnInteger(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := mirrorDistanceOfAnInteger(root.Left)
	r := mirrorDistanceOfAnInteger(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}