func longestSubstringWithoutRepeati(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := longestSubstringWithoutRepeati(root.Left)
	r := longestSubstringWithoutRepeati(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}