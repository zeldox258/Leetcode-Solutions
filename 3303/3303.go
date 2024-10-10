func findTheOccurrenceOfFirstAlmost(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findTheOccurrenceOfFirstAlmost(root.Left)
	r := findTheOccurrenceOfFirstAlmost(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}