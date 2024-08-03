func smallestRotationWithHighestSco(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := smallestRotationWithHighestSco(root.Left)
	r := smallestRotationWithHighestSco(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}