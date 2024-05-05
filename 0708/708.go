func insertIntoASortedCircularLinke(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := insertIntoASortedCircularLinke(root.Left)
	r := insertIntoASortedCircularLinke(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}