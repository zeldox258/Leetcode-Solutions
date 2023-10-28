func lengthOfLongestSubarrayWithAtM(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := lengthOfLongestSubarrayWithAtM(root.Left)
	r := lengthOfLongestSubarrayWithAtM(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}