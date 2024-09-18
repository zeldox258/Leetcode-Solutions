func guessTheWord(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := guessTheWord(root.Left)
	r := guessTheWord(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}