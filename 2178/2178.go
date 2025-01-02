func maximumSplitOfPositiveEvenInte(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumSplitOfPositiveEvenInte(root.Left)
	r := maximumSplitOfPositiveEvenInte(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}