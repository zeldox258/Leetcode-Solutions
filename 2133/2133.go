func checkIfEveryRowAndColumnContai(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := checkIfEveryRowAndColumnContai(root.Left)
	r := checkIfEveryRowAndColumnContai(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}