func maximumGeneticDifferenceQuery(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumGeneticDifferenceQuery(root.Left)
	r := maximumGeneticDifferenceQuery(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}