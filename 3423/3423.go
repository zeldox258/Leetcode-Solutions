func maximumDifferenceBetweenAdjace(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumDifferenceBetweenAdjace(root.Left)
	r := maximumDifferenceBetweenAdjace(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}