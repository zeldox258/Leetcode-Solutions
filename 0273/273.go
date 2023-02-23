func integerToEnglishWords(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := integerToEnglishWords(root.Left)
	r := integerToEnglishWords(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}