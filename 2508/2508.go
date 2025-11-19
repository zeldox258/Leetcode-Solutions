func addEdgesToMakeDegreesOfAllNode(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := addEdgesToMakeDegreesOfAllNode(root.Left)
	r := addEdgesToMakeDegreesOfAllNode(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}