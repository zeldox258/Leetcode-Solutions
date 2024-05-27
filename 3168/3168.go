func minimumNumberOfChairsInAWaitin(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumNumberOfChairsInAWaitin(root.Left)
	r := minimumNumberOfChairsInAWaitin(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}