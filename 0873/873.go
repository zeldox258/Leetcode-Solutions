func lengthOfLongestFibonacciSubseq(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := lengthOfLongestFibonacciSubseq(root.Left)
	r := lengthOfLongestFibonacciSubseq(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}