func minimumNumberOfMovesToMakePali(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumNumberOfMovesToMakePali(root.Left)
	r := minimumNumberOfMovesToMakePali(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}