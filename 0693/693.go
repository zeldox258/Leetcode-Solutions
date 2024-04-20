func binaryNumberWithAlternatingBit(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := binaryNumberWithAlternatingBit(root.Left)
	r := binaryNumberWithAlternatingBit(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}