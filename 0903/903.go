func validPermutationsForDiSequence(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := validPermutationsForDiSequence(root.Left)
	r := validPermutationsForDiSequence(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}