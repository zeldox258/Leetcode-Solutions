func countUniqueCharactersOfAllSubs(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countUniqueCharactersOfAllSubs(root.Left)
	r := countUniqueCharactersOfAllSubs(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}