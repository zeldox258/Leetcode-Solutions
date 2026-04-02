func rowWithMaximumOnes(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := rowWithMaximumOnes(root.Left)
	r := rowWithMaximumOnes(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}