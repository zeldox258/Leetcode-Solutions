func maximumRepeatingSubstring(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumRepeatingSubstring(root.Left)
	r := maximumRepeatingSubstring(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}