func minimumChangesToMakeAlternatin(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumChangesToMakeAlternatin(root.Left)
	r := minimumChangesToMakeAlternatin(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}