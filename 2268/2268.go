func minimumNumberOfKeypresses(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumNumberOfKeypresses(root.Left)
	r := minimumNumberOfKeypresses(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}