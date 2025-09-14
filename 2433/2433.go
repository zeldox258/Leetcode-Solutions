func findTheOriginalArrayOfPrefixXo(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findTheOriginalArrayOfPrefixXo(root.Left)
	r := findTheOriginalArrayOfPrefixXo(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}