func findEdgesInShortestPaths(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findEdgesInShortestPaths(root.Left)
	r := findEdgesInShortestPaths(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}