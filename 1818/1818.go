func minimumAbsoluteSumDifference(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumAbsoluteSumDifference(root.Left)
	r := minimumAbsoluteSumDifference(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}