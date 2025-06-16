func numberOfEquivalentDominoPairs(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfEquivalentDominoPairs(root.Left)
	r := numberOfEquivalentDominoPairs(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}