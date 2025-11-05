func longestFibonacciSubarray(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := longestFibonacciSubarray(root.Left)
	r := longestFibonacciSubarray(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}