func previousPermutationWithOneSwap(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := previousPermutationWithOneSwap(root.Left)
	r := previousPermutationWithOneSwap(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}