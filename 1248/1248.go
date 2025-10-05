func countNumberOfNiceSubarrays(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countNumberOfNiceSubarrays(root.Left)
	r := countNumberOfNiceSubarrays(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}