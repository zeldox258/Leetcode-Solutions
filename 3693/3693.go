func climbingStairsIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := climbingStairsIi(root.Left)
	r := climbingStairsIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}