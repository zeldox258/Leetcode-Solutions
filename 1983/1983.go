func widestPairOfIndicesWithEqualRa(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := widestPairOfIndicesWithEqualRa(root.Left)
	r := widestPairOfIndicesWithEqualRa(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}