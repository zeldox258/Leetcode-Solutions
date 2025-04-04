func unique3digitEvenNumbers(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := unique3digitEvenNumbers(root.Left)
	r := unique3digitEvenNumbers(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}